// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of a virtual machine extension handler.
 * 
 */
public final class VirtualMachineExtensionHandlerInstanceViewResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineExtensionHandlerInstanceViewResponse Empty = new VirtualMachineExtensionHandlerInstanceViewResponse();

    /**
     * The extension handler status.
     * 
     */
    @Import(name="status")
      private final @Nullable InstanceViewStatusResponse status;

    public Optional<InstanceViewStatusResponse> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Specifies the type of the extension; an example is &#34;CustomScriptExtension&#34;.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @Import(name="typeHandlerVersion")
      private final @Nullable String typeHandlerVersion;

    public Optional<String> typeHandlerVersion() {
        return this.typeHandlerVersion == null ? Optional.empty() : Optional.ofNullable(this.typeHandlerVersion);
    }

    public VirtualMachineExtensionHandlerInstanceViewResponse(
        @Nullable InstanceViewStatusResponse status,
        @Nullable String type,
        @Nullable String typeHandlerVersion) {
        this.status = status;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private VirtualMachineExtensionHandlerInstanceViewResponse() {
        this.status = null;
        this.type = null;
        this.typeHandlerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineExtensionHandlerInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InstanceViewStatusResponse status;
        private @Nullable String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineExtensionHandlerInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder status(@Nullable InstanceViewStatusResponse status) {
            this.status = status;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder typeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }        public VirtualMachineExtensionHandlerInstanceViewResponse build() {
            return new VirtualMachineExtensionHandlerInstanceViewResponse(status, type, typeHandlerVersion);
        }
    }
}
