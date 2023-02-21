# process_loan(amount) -> None # amount is a dollar amount
# get_loan_volume() -> Decimal # the total sum of loan amounts processed in the last 1 hour

import time 

loan_queue = []
current_time = 1646173994
current_total = 0

loan1 = {
    "amount": 100,
    "timestamp": 1646169990
}

loan2 = {
    "amount": 200,
    "timestamp": 1646173989
}

loan3= {
    "amount": 200,
    "timestamp": 1646173989
}

print(time.time())

"""
def process_loan(amount):
    loan = {
        "amount": amount,
        "timestamp": time.time()
    }
    
    loan_queue.append(loan)
    current_total = current_total + loan['amount']
    
    #Remove old loans 
    if len(loan_queue) > 0: 
        for loan_expired in loan_queue: 
            print(loan_expired['timestamp']) 
            if(current_time - loan_expired['timestamp'] > 3600):
                current_total = current_total - loan['amount']
                loan_queue.pop(loan_expired)           
    else: 
        print("no loans")
        
        
def add_to_loan(loan, loan_queue, current_total):
    loan_queue.append(loan)
    current_total = current_total + loan['amount']
    
    #Remove old loans 
    if len(loan_queue) > 0: 
        for loan_expired in loan_queue: 
            print(loan_expired['timestamp']) 
            if(current_time - loan_expired['timestamp'] > 3600):
                current_total = current_total - loan['amount']
                loan_queue.pop(loan_expired)           
    else: 
        print("no loans")
           

def get_loan_volume():
    print(current_total)
    
add_to_loan(loan1, loan_queue, current_total)
print(loan_queue)
add_to_loan(loan2, loan_queue, current_total)
print(loan_queue)

"""

    
#STEP 1: Put each new in a queue (amount, timestamp)
#Q = [d= {amount: 100, timestamp: 1pm}]
#STEP 2: Keep the Queue organized for 1 hour 
#STEP 3: get loan volume
#keep running total 
# as you add add to total
# as you remove from queue subtact loan

