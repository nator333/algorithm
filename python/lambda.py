import boto3

lambda_client = boto3.client('lambda')

def get_function_names():
    fuction_names = []
    res = lambda_client.list_functions()
    fuction_names.extend([f['FunctionName'] for f in res['Functions']])
    while 'NextMarker' in res:
        res = lambda_client.list_functions(Marker=res['NextMarker'])
        fuction_names.extend(
        [f['FunctionName'] for f in res['Functions']])
        return fuction_names

for name in get_function_names():
    reserved = "-"
    function_data = lambda_client.get_function(FunctionName=name)
    if 'Concurrency' in function_data and 'ReservedConcurrentExecutions' in function_data['Concurrency']:
        reserved = str(function_data['Concurrency']['ReservedConcurrentExecutions'])
        print(name + "\t" + reserved)
