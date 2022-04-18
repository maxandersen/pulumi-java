// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.azurenative.migrate.inputs.MoveResourceErrorBodyResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An error response from the azure resource mover service.
 * 
 */
public final class MoveResourceErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final MoveResourceErrorResponse Empty = new MoveResourceErrorResponse();

    /**
     * The move resource error body.
     * 
     */
    @Import(name="properties")
      private final @Nullable MoveResourceErrorBodyResponse properties;

    public Optional<MoveResourceErrorBodyResponse> properties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    public MoveResourceErrorResponse(@Nullable MoveResourceErrorBodyResponse properties) {
        this.properties = properties;
    }

    private MoveResourceErrorResponse() {
        this.properties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourceErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MoveResourceErrorBodyResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourceErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder properties(@Nullable MoveResourceErrorBodyResponse properties) {
            this.properties = properties;
            return this;
        }        public MoveResourceErrorResponse build() {
            return new MoveResourceErrorResponse(properties);
        }
    }
}
