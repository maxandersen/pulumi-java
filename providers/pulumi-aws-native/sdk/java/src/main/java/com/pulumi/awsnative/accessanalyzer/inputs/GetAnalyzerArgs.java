// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.accessanalyzer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAnalyzerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAnalyzerArgs Empty = new GetAnalyzerArgs();

    /**
     * Amazon Resource Name (ARN) of the analyzer
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetAnalyzerArgs() {}

    private GetAnalyzerArgs(GetAnalyzerArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAnalyzerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAnalyzerArgs $;

        public Builder() {
            $ = new GetAnalyzerArgs();
        }

        public Builder(GetAnalyzerArgs defaults) {
            $ = new GetAnalyzerArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetAnalyzerArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
