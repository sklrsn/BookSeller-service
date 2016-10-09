
/**
 * FindingServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */

    package com.ebay.www.marketplace.search.v1.services;

    /**
     *  FindingServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class FindingServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public FindingServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public FindingServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for findItemsByImage method
            * override this method for handling normal response from findItemsByImage operation
            */
           public void receiveResultfindItemsByImage(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.FindItemsByImageResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findItemsByImage operation
           */
            public void receiveErrorfindItemsByImage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSearchKeywordsRecommendation method
            * override this method for handling normal response from getSearchKeywordsRecommendation operation
            */
           public void receiveResultgetSearchKeywordsRecommendation(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.GetSearchKeywordsRecommendationResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSearchKeywordsRecommendation operation
           */
            public void receiveErrorgetSearchKeywordsRecommendation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHistograms method
            * override this method for handling normal response from getHistograms operation
            */
           public void receiveResultgetHistograms(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.GetHistogramsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHistograms operation
           */
            public void receiveErrorgetHistograms(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findItemsByProduct method
            * override this method for handling normal response from findItemsByProduct operation
            */
           public void receiveResultfindItemsByProduct(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.FindItemsByProductResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findItemsByProduct operation
           */
            public void receiveErrorfindItemsByProduct(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findItemsByKeywords method
            * override this method for handling normal response from findItemsByKeywords operation
            */
           public void receiveResultfindItemsByKeywords(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.FindItemsByKeywordsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findItemsByKeywords operation
           */
            public void receiveErrorfindItemsByKeywords(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findItemsByCategory method
            * override this method for handling normal response from findItemsByCategory operation
            */
           public void receiveResultfindItemsByCategory(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.FindItemsByCategoryResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findItemsByCategory operation
           */
            public void receiveErrorfindItemsByCategory(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findCompletedItems method
            * override this method for handling normal response from findCompletedItems operation
            */
           public void receiveResultfindCompletedItems(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.FindCompletedItemsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findCompletedItems operation
           */
            public void receiveErrorfindCompletedItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findItemsForFavoriteSearch method
            * override this method for handling normal response from findItemsForFavoriteSearch operation
            */
           public void receiveResultfindItemsForFavoriteSearch(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.FindItemsForFavoriteSearchResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findItemsForFavoriteSearch operation
           */
            public void receiveErrorfindItemsForFavoriteSearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findItemsAdvanced method
            * override this method for handling normal response from findItemsAdvanced operation
            */
           public void receiveResultfindItemsAdvanced(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.FindItemsAdvancedResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findItemsAdvanced operation
           */
            public void receiveErrorfindItemsAdvanced(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getVersion method
            * override this method for handling normal response from getVersion operation
            */
           public void receiveResultgetVersion(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.GetVersionResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getVersion operation
           */
            public void receiveErrorgetVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findItemsIneBayStores method
            * override this method for handling normal response from findItemsIneBayStores operation
            */
           public void receiveResultfindItemsIneBayStores(
                    com.ebay.www.marketplace.search.v1.services.FindingServiceStub.FindItemsIneBayStoresResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findItemsIneBayStores operation
           */
            public void receiveErrorfindItemsIneBayStores(java.lang.Exception e) {
            }
                


    }
    