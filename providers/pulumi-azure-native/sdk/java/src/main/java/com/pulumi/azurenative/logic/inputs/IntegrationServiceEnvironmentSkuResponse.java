// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The integration service environment sku.
 * 
 */
public final class IntegrationServiceEnvironmentSkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final IntegrationServiceEnvironmentSkuResponse Empty = new IntegrationServiceEnvironmentSkuResponse();

    /**
     * The sku capacity.
     * 
     */
    @Import(name="capacity")
    private @Nullable Integer capacity;

    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The sku name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private IntegrationServiceEnvironmentSkuResponse() {}

    private IntegrationServiceEnvironmentSkuResponse(IntegrationServiceEnvironmentSkuResponse $) {
        this.capacity = $.capacity;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationServiceEnvironmentSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationServiceEnvironmentSkuResponse $;

        public Builder() {
            $ = new IntegrationServiceEnvironmentSkuResponse();
        }

        public Builder(IntegrationServiceEnvironmentSkuResponse defaults) {
            $ = new IntegrationServiceEnvironmentSkuResponse(Objects.requireNonNull(defaults));
        }

        public Builder capacity(@Nullable Integer capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public IntegrationServiceEnvironmentSkuResponse build() {
            return $;
        }
    }

}
