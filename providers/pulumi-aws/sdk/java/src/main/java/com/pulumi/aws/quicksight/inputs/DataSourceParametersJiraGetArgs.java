// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersJiraGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersJiraGetArgs Empty = new DataSourceParametersJiraGetArgs();

    /**
     * The base URL of the Jira instance&#39;s site to which to connect.
     * 
     */
    @Import(name="siteBaseUrl", required=true)
      private final Output<String> siteBaseUrl;

    public Output<String> siteBaseUrl() {
        return this.siteBaseUrl;
    }

    public DataSourceParametersJiraGetArgs(Output<String> siteBaseUrl) {
        this.siteBaseUrl = Objects.requireNonNull(siteBaseUrl, "expected parameter 'siteBaseUrl' to be non-null");
    }

    private DataSourceParametersJiraGetArgs() {
        this.siteBaseUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersJiraGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> siteBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersJiraGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteBaseUrl = defaults.siteBaseUrl;
        }

        public Builder siteBaseUrl(Output<String> siteBaseUrl) {
            this.siteBaseUrl = Objects.requireNonNull(siteBaseUrl);
            return this;
        }
        public Builder siteBaseUrl(String siteBaseUrl) {
            this.siteBaseUrl = Output.of(Objects.requireNonNull(siteBaseUrl));
            return this;
        }        public DataSourceParametersJiraGetArgs build() {
            return new DataSourceParametersJiraGetArgs(siteBaseUrl);
        }
    }
}
