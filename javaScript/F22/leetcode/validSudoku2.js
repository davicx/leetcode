const board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]

const answer = isValidSudoku(board)

function isValidSudoku(board) {
    let across = checkAllAcross(board)
    console.log(across) 
    const down = checkAllDown(board)
    console.log(down) 
}

function checkAllAcross(board) {
    var numSet = new Set()

    for (let l = 0; l < board.length; l++) {   

        for (let h = 0; h < board.length; h++) {
            let currentNum = board[l][h]
            if(currentNum != '.') {
                if(numSet.has(currentNum)) {
                    return false;
                } else {
                    numSet.add(currentNum)
                }
            }
            //console.log(numSet)
        }     
        numSet.clear()
    } 
    return true; 
}

//CHECK: All Down
function checkAllDown(board) {
    var numSet = new Set()

    for (let l = 0; l < board.length; l++) {
        for (let h = 0; h < board.length; h++) {
            let currentNum = board[h][l]
            if(currentNum != '.') {
                if(numSet.has(currentNum)) {
                    return false;
                } else {
                    numSet.add(currentNum)
                }
            }
            //console.log(numSet)
        }    
        numSet.clear()
    }  
    return true
}


/*
function checkDown(board, column) {
    var mySet = new Set()

    for(let i = 0; i < board.length; i++) {
        let num = board[i][column];
        if(num != '.') {
            if(mySet.has(num)) {
                return false;
                //console.log("duplicate found " + i + " " + num);
            } else {
                mySet.add(num)
                //console.log("new! " + i + " " + num);
            }
        }
        //console.log(board[i][column]);
    }
    return true;
}

*/