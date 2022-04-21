// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Indicates that the builder claims certain fields in this message to be complete.
 * 
 */
public final class SlsaCompletenessResponse extends com.pulumi.resources.InvokeArgs {

    public static final SlsaCompletenessResponse Empty = new SlsaCompletenessResponse();

    /**
     * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
     * 
     */
    @Import(name="arguments", required=true)
    private Boolean arguments;

    public Boolean arguments() {
        return this.arguments;
    }

    /**
     * If true, the builder claims that recipe.environment is claimed to be complete.
     * 
     */
    @Import(name="environment", required=true)
    private Boolean environment;

    public Boolean environment() {
        return this.environment;
    }

    /**
     * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called &#34;hermetic&#34;.
     * 
     */
    @Import(name="materials", required=true)
    private Boolean materials;

    public Boolean materials() {
        return this.materials;
    }

    private SlsaCompletenessResponse() {}

    private SlsaCompletenessResponse(SlsaCompletenessResponse $) {
        this.arguments = $.arguments;
        this.environment = $.environment;
        this.materials = $.materials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlsaCompletenessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlsaCompletenessResponse $;

        public Builder() {
            $ = new SlsaCompletenessResponse();
        }

        public Builder(SlsaCompletenessResponse defaults) {
            $ = new SlsaCompletenessResponse(Objects.requireNonNull(defaults));
        }

        public Builder arguments(Boolean arguments) {
            $.arguments = arguments;
            return this;
        }

        public Builder environment(Boolean environment) {
            $.environment = environment;
            return this;
        }

        public Builder materials(Boolean materials) {
            $.materials = materials;
            return this;
        }

        public SlsaCompletenessResponse build() {
            $.arguments = Objects.requireNonNull($.arguments, "expected parameter 'arguments' to be non-null");
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.materials = Objects.requireNonNull($.materials, "expected parameter 'materials' to be non-null");
            return $;
        }
    }

}
