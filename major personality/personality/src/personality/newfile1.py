import re 

from textblob import TextBlob 

class TwitterClient(object): 
    ''' 
    Generic Twitter Class for sentiment analysis. 
    '''
    def __init__(self): 
        ''' 
        Class constructor or initialization method. 
        '''

    def clean_tweet(self, tweet): 
        ''' 
        Utility function to clean tweet text by removing links, special characters 
        using simple regex statements. 
        '''
        return ' '.join(re.sub("(@[A-Za-z0-9]+)|([^0-9A-Za-z \t]) |(\w+:\/\/\S+)", " ", tweet).split()) 
    def get_tweet_sentiment(self, tweet): 
        ''' 
        Utility function to classify sentiment of passed tweet 
        using textblob's sentiment method 
        '''
        # create TextBlob object of passed tweet text 
        analysis = TextBlob(self.clean_tweet(tweet)) 
        # set sentiment 
        
        if analysis.sentiment.polarity > 0: 
            return 'positive'
        elif analysis.sentiment.polarity == 0: 
            return 'neutral'
        else: 
            return 'negative'

def main(s): 
    # creating object of TwitterClient Class 
    api = TwitterClient() 
    # calling function to get tweets 
    #s = "good not bad"
    s1=str(s)
    tweets = api.clean_tweet(s1)
    pos=0
    neg=0
    neu=0
    
    for i in tweets.split():
        if api.get_tweet_sentiment(i)=="negative":
            neg+=1
        elif api.get_tweet_sentiment(i)=="positive":
            pos+=1
        else:
            neu+=1
    print('Positive=',str(pos),'Negative=',str(neg),'Neutral=',str(neu))
    return int(pos-neg)
if __name__ == "__main__": 
# calling main function 
    main(sys.argv[0]) 
