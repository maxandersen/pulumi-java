// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dynamic Executor Allocation Properties
 * 
 */
public final class DynamicExecutorAllocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final DynamicExecutorAllocationResponse Empty = new DynamicExecutorAllocationResponse();

    /**
     * Indicates whether Dynamic Executor Allocation is enabled or not.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private DynamicExecutorAllocationResponse() {}

    private DynamicExecutorAllocationResponse(DynamicExecutorAllocationResponse $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicExecutorAllocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicExecutorAllocationResponse $;

        public Builder() {
            $ = new DynamicExecutorAllocationResponse();
        }

        public Builder(DynamicExecutorAllocationResponse defaults) {
            $ = new DynamicExecutorAllocationResponse(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public DynamicExecutorAllocationResponse build() {
            return $;
        }
    }

}
