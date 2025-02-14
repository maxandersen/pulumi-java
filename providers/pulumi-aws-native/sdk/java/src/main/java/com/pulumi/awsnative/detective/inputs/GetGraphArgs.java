// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.detective.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGraphArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGraphArgs Empty = new GetGraphArgs();

    /**
     * The Detective graph ARN
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Detective graph ARN
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetGraphArgs() {}

    private GetGraphArgs(GetGraphArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGraphArgs $;

        public Builder() {
            $ = new GetGraphArgs();
        }

        public Builder(GetGraphArgs defaults) {
            $ = new GetGraphArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Detective graph ARN
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetGraphArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
