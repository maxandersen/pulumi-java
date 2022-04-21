// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The bucket&#39;s website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information.
 * 
 */
public final class BucketWebsiteResponse extends com.pulumi.resources.InvokeArgs {

    public static final BucketWebsiteResponse Empty = new BucketWebsiteResponse();

    /**
     * If the requested object path is missing, the service will ensure the path has a trailing &#39;/&#39;, append this suffix, and attempt to retrieve the resulting object. This allows the creation of index.html objects to represent directory pages.
     * 
     */
    @Import(name="mainPageSuffix", required=true)
    private String mainPageSuffix;

    public String mainPageSuffix() {
        return this.mainPageSuffix;
    }

    /**
     * If the requested object path is missing, and any mainPageSuffix object is missing, if applicable, the service will return the named object from this bucket as the content for a 404 Not Found result.
     * 
     */
    @Import(name="notFoundPage", required=true)
    private String notFoundPage;

    public String notFoundPage() {
        return this.notFoundPage;
    }

    private BucketWebsiteResponse() {}

    private BucketWebsiteResponse(BucketWebsiteResponse $) {
        this.mainPageSuffix = $.mainPageSuffix;
        this.notFoundPage = $.notFoundPage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketWebsiteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketWebsiteResponse $;

        public Builder() {
            $ = new BucketWebsiteResponse();
        }

        public Builder(BucketWebsiteResponse defaults) {
            $ = new BucketWebsiteResponse(Objects.requireNonNull(defaults));
        }

        public Builder mainPageSuffix(String mainPageSuffix) {
            $.mainPageSuffix = mainPageSuffix;
            return this;
        }

        public Builder notFoundPage(String notFoundPage) {
            $.notFoundPage = notFoundPage;
            return this;
        }

        public BucketWebsiteResponse build() {
            $.mainPageSuffix = Objects.requireNonNull($.mainPageSuffix, "expected parameter 'mainPageSuffix' to be non-null");
            $.notFoundPage = Objects.requireNonNull($.notFoundPage, "expected parameter 'notFoundPage' to be non-null");
            return $;
        }
    }

}
