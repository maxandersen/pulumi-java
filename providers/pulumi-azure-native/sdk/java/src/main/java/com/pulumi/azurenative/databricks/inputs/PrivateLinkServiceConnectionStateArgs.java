// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.azurenative.databricks.enums.PrivateLinkServiceConnectionStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The current state of a private endpoint connection
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * Actions required for a private endpoint connection
     * 
     */
    @Import(name="actionRequired")
      private final @Nullable Output<String> actionRequired;

    public Output<String> actionRequired() {
        return this.actionRequired == null ? Codegen.empty() : this.actionRequired;
    }

    /**
     * The description for the current state of a private endpoint connection
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The status of a private endpoint connection
     * 
     */
    @Import(name="status", required=true)
      private final Output<Either<String,PrivateLinkServiceConnectionStatus>> status;

    public Output<Either<String,PrivateLinkServiceConnectionStatus>> status() {
        return this.status;
    }

    public PrivateLinkServiceConnectionStateArgs(
        @Nullable Output<String> actionRequired,
        @Nullable Output<String> description,
        Output<Either<String,PrivateLinkServiceConnectionStatus>> status) {
        this.actionRequired = actionRequired;
        this.description = description;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private PrivateLinkServiceConnectionStateArgs() {
        this.actionRequired = Codegen.empty();
        this.description = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionRequired;
        private @Nullable Output<String> description;
        private Output<Either<String,PrivateLinkServiceConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionRequired = defaults.actionRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionRequired(@Nullable Output<String> actionRequired) {
            this.actionRequired = actionRequired;
            return this;
        }
        public Builder actionRequired(@Nullable String actionRequired) {
            this.actionRequired = Codegen.ofNullable(actionRequired);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder status(Output<Either<String,PrivateLinkServiceConnectionStatus>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(Either<String,PrivateLinkServiceConnectionStatus> status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public PrivateLinkServiceConnectionStateArgs build() {
            return new PrivateLinkServiceConnectionStateArgs(actionRequired, description, status);
        }
    }
}
