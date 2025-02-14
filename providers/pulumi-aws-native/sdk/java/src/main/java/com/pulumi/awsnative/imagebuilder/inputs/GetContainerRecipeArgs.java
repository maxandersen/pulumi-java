// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContainerRecipeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContainerRecipeArgs Empty = new GetContainerRecipeArgs();

    /**
     * The Amazon Resource Name (ARN) of the container recipe.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the container recipe.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetContainerRecipeArgs() {}

    private GetContainerRecipeArgs(GetContainerRecipeArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerRecipeArgs $;

        public Builder() {
            $ = new GetContainerRecipeArgs();
        }

        public Builder(GetContainerRecipeArgs defaults) {
            $ = new GetContainerRecipeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the container recipe.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetContainerRecipeArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
