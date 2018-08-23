     try {
                    f = YourArrayFrom_in_String;
                    String arrays = f; //Represent your array toString();
                    JSONArray jsonArray = new JSONArray(arrays);
                    JSONObject jsonObject;
                    for (int i = 0; i < jsonArray.length(); i++) {
                        jsonObject = jsonArray.getJSONObject(i);
                        String key1 = jsonObject.getString("key1");
                        String key2 = jsonObject.getString("key2");
                        String key3 = jsonObject.getString("key3");
                        String key4 = jsonObject.getString("key4");
                        //Get all your keys from the above example, then get your "monthly_invoice_detail" like this
                        JSONArray monthly_invoice_detail_array = new JSONArray(jsonObject.getString("monthly_invoice_detail"));
                        JSONObject monthly_invoice_detail = monthly_invoice_detail_array.getJSONObject(0);
                        String key9_1 = monthly_invoice_detail.getString("key9_1");
                        String key9_2 = monthly_invoice_detail.getString("key9_2");
                        //Iterate all your monthly invoice key here
                    }
                } catch (JSONException ex) {
                    ex.printStackTrace();
                }
