package algorithm.basic.sort

class BubbleSortTest extends SortTest {
    BubbleSortTest() {
        this.sort = new BubbleSort()
    }

    public testImprovedSort() {
        println this.class.getSimpleName() + ":"

        int[] argIntAry = [3, 1, 2, 5, 4]
        Integer[] ansIntAry = [1, 2, 3, 4, 5]
        assertArrayEquals((Integer[])sort.improvedSort(argIntAry), ansIntAry)
        sort.inspection.printComplexity(argIntAry.length)

        argIntAry = [4, 8, 2, 5, 7, 6, 3, 10, 1, 9]
        ansIntAry = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        assertArrayEquals((Integer[])sort.improvedSort(argIntAry), ansIntAry)
        sort.inspection.printComplexity(argIntAry.length)

        argIntAry = [19, 65, 32, 16, 29, 40, 1, 8, 93, 77, 84, 76, 71, 43, 21, 34, 85, 5, 48, 78, 79, 50, 80, 10, 9, 24, 28, 49, 7, 35, 55, 36, 98, 33, 83, 31, 2, 61, 30, 47, 96, 22, 17, 72, 51, 57, 42, 39, 53, 26, 63, 44, 56, 14, 68, 87, 62, 66, 100, 11, 15, 67, 25, 4, 69, 73, 97, 89, 3, 86, 46, 99, 12, 82, 38, 90, 37, 27, 52, 81, 60, 64, 59, 91, 58, 70, 13, 74, 92, 45, 18, 41, 94, 95, 20, 23, 88, 54, 6, 75]
        ansIntAry = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
        assertArrayEquals((Integer[])sort.improvedSort(argIntAry), ansIntAry)
        sort.inspection.printComplexity(argIntAry.length)

        argIntAry = [57, 481, 547, 277, 215, 637, 761, 634, 522, 403, 111, 145, 889, 950, 729, 187, 81, 26, 316, 806, 4, 611, 751, 366, 475, 502, 802, 89, 964, 219, 989, 437, 978, 948, 469, 880, 766, 533, 595, 714, 261, 137, 638, 452, 132, 410, 407, 211, 951, 325, 392, 185, 598, 985, 282, 99, 11, 151, 480, 531, 148, 265, 854, 86, 369, 330, 484, 386, 309, 675, 915, 458, 508, 712, 961, 288, 222, 756, 331, 93, 362, 235, 775, 935, 319, 703, 364, 982, 633, 686, 389, 586, 560, 773, 718, 56, 659, 13, 80, 473, 798, 96, 384, 324, 32, 589, 337, 191, 141, 55, 103, 901, 749, 907, 200, 548, 52, 759, 998, 816, 882, 429, 397, 812, 849, 583, 64, 250, 220, 650, 252, 545, 828, 873, 343, 347, 507, 390, 98, 395, 460, 230, 45, 842, 870, 926, 336, 79, 115, 509, 726, 604, 558, 781, 627, 976, 430, 776, 307, 234, 535, 833, 511, 229, 811, 405, 591, 406, 161, 724, 537, 599, 83, 88, 296, 597, 197, 318, 257, 290, 722, 198, 470, 356, 999, 970, 128, 845, 771, 455, 624, 447, 699, 251, 514, 636, 308, 479, 601, 272, 974, 210, 805, 823, 339, 102, 328, 963, 938, 34, 421, 883, 274, 118, 396, 530, 746, 643, 474, 550, 195, 512, 557, 679, 646, 573, 466, 446, 534, 462, 131, 297, 521, 571, 231, 353, 684, 933, 285, 182, 616, 216, 905, 697, 448, 841, 333, 621, 189, 94, 76, 464, 658, 877, 84, 134, 35, 124, 723, 51, 457, 168, 5, 44, 607, 676, 1000, 3, 797, 652, 144, 143, 401, 818, 593, 62, 376, 152, 104, 443, 958, 588, 924, 487, 110, 270, 904, 579, 338, 335, 40, 433, 857, 248, 609, 91, 996, 398, 14, 172, 503, 899, 418, 411, 113, 969, 387, 835, 561, 748, 778, 431, 133, 153, 864, 791, 358, 176, 107, 837, 645, 256, 678, 246, 214, 424, 496, 190, 50, 929, 644, 423, 918, 506, 188, 150, 727, 417, 203, 413, 912, 787, 157, 668, 169, 673, 937, 670, 824, 896, 730, 444, 391, 292, 664, 271, 342, 903, 830, 911, 528, 244, 263, 363, 584, 275, 949, 17, 839, 735, 725, 707, 734, 520, 768, 945, 138, 233, 445, 793, 346, 517, 28, 414, 745, 753, 380, 968, 21, 630, 400, 279, 164, 570, 702, 732, 361, 359, 485, 293, 744, 695, 286, 177, 499, 731, 614, 68, 656, 620, 204, 300, 972, 709, 523, 207, 492, 322, 415, 789, 498, 65, 67, 767, 72, 105, 312, 931, 375, 566, 527, 31, 887, 908, 516, 884, 289, 769, 173, 140, 53, 459, 46, 434, 167, 782, 943, 18, 615, 477, 208, 426, 960, 199, 381, 501, 906, 590, 117, 568, 693, 977, 519, 49, 119, 436, 701, 552, 340, 351, 770, 388, 829, 990, 865, 832, 408, 840, 894, 850, 438, 574, 304, 192, 980, 613, 348, 280, 450, 866, 394, 939, 672, 563, 478, 875, 863, 700, 147, 553, 116, 10, 154, 73, 715, 223, 764, 165, 77, 409, 85, 82, 622, 843, 209, 543, 33, 876, 194, 800, 370, 790, 642, 836, 486, 657, 240, 900, 305, 808, 123, 792, 427, 242, 605, 217, 510, 928, 582, 422, 268, 344, 129, 350, 58, 184, 539, 518, 844, 821, 603, 378, 95, 254, 651, 606, 341, 810, 688, 825, 310, 567, 600, 158, 314, 237, 922, 467, 739, 852, 39, 373, 801, 572, 425, 934, 913, 9, 594, 525, 705, 858, 581, 70, 981, 476, 295, 869, 90, 750, 221, 920, 149, 332, 954, 504, 122, 940, 294, 71, 942, 878, 136, 435, 1, 647, 327, 385, 232, 917, 374, 48, 569, 155, 126, 323, 834, 680, 27, 881, 704, 608, 654, 710, 245, 449, 831, 696, 321, 763, 47, 587, 267, 2, 451, 794, 162, 936, 37, 112, 532, 855, 683, 371, 181, 247, 612, 100, 795, 542, 515, 555, 193, 706, 412, 819, 156, 377, 859, 170, 61, 549, 354, 803, 183, 236, 101, 779, 166, 971, 302, 692, 127, 817, 713, 853, 663, 201, 783, 495, 891, 278, 685, 742, 602, 888, 653, 799, 988, 895, 175, 717, 826, 287, 721, 87, 317, 224, 987, 488, 439, 827, 106, 416, 956, 994, 628, 20, 979, 546, 925, 6, 142, 544, 822, 596, 472, 75, 299, 807, 631, 108, 202, 228, 629, 29, 500, 541, 992, 690, 180, 762, 259, 174, 255, 428, 554, 465, 383, 526, 626, 815, 536, 687, 12, 617, 677, 196, 482, 163, 777, 8, 966, 382, 74, 121, 578, 372, 986, 728, 562, 313, 681, 456, 788, 66, 249, 885, 733, 564, 916, 967, 16, 962, 491, 399, 109, 379, 580, 847, 851, 15, 556, 886, 691, 540, 743, 69, 861, 813, 36, 19, 276, 946, 635, 897, 848, 114, 432, 719, 38, 179, 159, 755, 927, 453, 205, 186, 947, 130, 24, 355, 283, 965, 667, 846, 97, 441, 357, 740, 213, 218, 538, 856, 420, 682, 490, 991, 890, 311, 757, 301, 784, 258, 497, 860, 559, 315, 463, 610, 206, 736, 997, 442, 953, 23, 879, 334, 737, 281, 752, 716, 689, 577, 774, 973, 125, 402, 461, 284, 655, 814, 273, 41, 809, 171, 892, 952, 930, 585, 25, 641, 919, 660, 226, 42, 741, 754, 494, 551, 345, 120, 871, 575, 468, 493, 619, 923, 227, 303, 298, 671, 893, 661, 862, 368, 225, 349, 625, 306, 708, 419, 454, 867, 471, 648, 260, 22, 63, 60, 524, 796, 212, 92, 669, 262, 632, 43, 786, 804, 30, 513, 944, 902, 955, 239, 941, 666, 711, 975, 178, 738, 957, 54, 393, 264, 135, 640, 238, 921, 266, 872, 758, 995, 765, 367, 7, 785, 269, 326, 483, 662, 404, 139, 59, 747, 329, 898, 365, 914, 241, 146, 565, 772, 623, 959, 780, 868, 993, 838, 360, 820, 674, 320, 78, 291, 694, 909, 665, 874, 760, 984, 910, 576, 243, 649, 489, 592, 639, 253, 983, 440, 505, 698, 932, 352, 160, 720, 529, 618]
        ansIntAry = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543, 544, 545, 546, 547, 548, 549, 550, 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688, 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 715, 716, 717, 718, 719, 720, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828, 829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 1000]
        assertArrayEquals((Integer[])sort.improvedSort(argIntAry), ansIntAry)
        sort.inspection.printComplexity(argIntAry.length)

        argIntAry = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
        ansIntAry = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
        assertArrayEquals((Integer[])sort.improvedSort(argIntAry), ansIntAry)
        sort.inspection.printComplexity(argIntAry.length)
    }
}
