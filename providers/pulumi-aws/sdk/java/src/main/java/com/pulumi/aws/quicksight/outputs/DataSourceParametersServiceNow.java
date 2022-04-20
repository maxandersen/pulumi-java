// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceParametersServiceNow {
    /**
     * The base URL of the Jira instance&#39;s site to which to connect.
     * 
     */
    private final String siteBaseUrl;

    @CustomType.Constructor
    private DataSourceParametersServiceNow(@CustomType.Parameter("siteBaseUrl") String siteBaseUrl) {
        this.siteBaseUrl = siteBaseUrl;
    }

    /**
     * The base URL of the Jira instance&#39;s site to which to connect.
     * 
    */
    public String siteBaseUrl() {
        return this.siteBaseUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersServiceNow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String siteBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersServiceNow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteBaseUrl = defaults.siteBaseUrl;
        }

        public Builder siteBaseUrl(String siteBaseUrl) {
            this.siteBaseUrl = Objects.requireNonNull(siteBaseUrl);
            return this;
        }        public DataSourceParametersServiceNow build() {
            return new DataSourceParametersServiceNow(siteBaseUrl);
        }
    }
}
