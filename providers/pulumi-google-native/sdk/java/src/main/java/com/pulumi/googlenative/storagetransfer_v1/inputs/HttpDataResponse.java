// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An HttpData resource specifies a list of objects on the web to be transferred over HTTP. The information of the objects to be transferred is contained in a file referenced by a URL. The first line in the file must be `"TsvHttpData-1.0"`, which specifies the format of the file. Subsequent lines specify the information of the list of objects, one object per list entry. Each entry has the following tab-delimited fields: * **HTTP URL** — The location of the object. * **Length** — The size of the object in bytes. * **MD5** — The base64-encoded MD5 hash of the object. For an example of a valid TSV file, see [Transferring data from URLs](https://cloud.google.com/storage-transfer/docs/create-url-list). When transferring data based on a URL list, keep the following in mind: * When an object located at `http(s)://hostname:port/` is transferred to a data sink, the name of the object at the data sink is `/`. * If the specified size of an object does not match the actual size of the object fetched, the object is not transferred. * If the specified MD5 does not match the MD5 computed from the transferred bytes, the object transfer fails. * Ensure that each URL you specify is publicly accessible. For example, in Cloud Storage you can [share an object publicly] (/storage/docs/cloud-console#_sharingdata) and get a link to it. * Storage Transfer Service obeys `robots.txt` rules and requires the source HTTP server to support `Range` requests and to return a `Content-Length` header in each response. * ObjectConditions have no effect when filtering objects to transfer.
 * 
 */
public final class HttpDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpDataResponse Empty = new HttpDataResponse();

    /**
     * The URL that points to the file that stores the object list entries. This file must allow public access. Currently, only URLs with HTTP and HTTPS schemes are supported.
     * 
     */
    @Import(name="listUrl", required=true)
      private final String listUrl;

    public String listUrl() {
        return this.listUrl;
    }

    public HttpDataResponse(String listUrl) {
        this.listUrl = Objects.requireNonNull(listUrl, "expected parameter 'listUrl' to be non-null");
    }

    private HttpDataResponse() {
        this.listUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String listUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listUrl = defaults.listUrl;
        }

        public Builder listUrl(String listUrl) {
            this.listUrl = Objects.requireNonNull(listUrl);
            return this;
        }        public HttpDataResponse build() {
            return new HttpDataResponse(listUrl);
        }
    }
}
