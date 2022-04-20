// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed identity configuration.
 * 
 */
public final class ManagedIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedIdentityArgs Empty = new ManagedIdentityArgs();

    /**
     * Specifies a user-assigned identity by client ID. For system-assigned, do not set this field.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * Enum to determine identity framework.
     * Expected value is &#39;Managed&#39;.
     * 
     */
    @Import(name="identityType", required=true)
      private final Output<String> identityType;

    public Output<String> identityType() {
        return this.identityType;
    }

    /**
     * Specifies a user-assigned identity by object ID. For system-assigned, do not set this field.
     * 
     */
    @Import(name="objectId")
      private final @Nullable Output<String> objectId;

    public Output<String> objectId() {
        return this.objectId == null ? Codegen.empty() : this.objectId;
    }

    /**
     * Specifies a user-assigned identity by ARM resource ID. For system-assigned, do not set this field.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    public ManagedIdentityArgs(
        @Nullable Output<String> clientId,
        Output<String> identityType,
        @Nullable Output<String> objectId,
        @Nullable Output<String> resourceId) {
        this.clientId = clientId;
        this.identityType = Codegen.stringProp("identityType").output().arg(identityType).require();
        this.objectId = objectId;
        this.resourceId = resourceId;
    }

    private ManagedIdentityArgs() {
        this.clientId = Codegen.empty();
        this.identityType = Codegen.empty();
        this.objectId = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private Output<String> identityType;
        private @Nullable Output<String> objectId;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.identityType = defaults.identityType;
    	      this.objectId = defaults.objectId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder identityType(Output<String> identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }
        public Builder identityType(String identityType) {
            this.identityType = Output.of(Objects.requireNonNull(identityType));
            return this;
        }
        public Builder objectId(@Nullable Output<String> objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = Codegen.ofNullable(objectId);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }        public ManagedIdentityArgs build() {
            return new ManagedIdentityArgs(clientId, identityType, objectId, resourceId);
        }
    }
}
