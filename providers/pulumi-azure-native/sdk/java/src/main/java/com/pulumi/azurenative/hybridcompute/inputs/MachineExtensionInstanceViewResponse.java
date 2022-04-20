// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute.inputs;

import com.pulumi.azurenative.hybridcompute.inputs.MachineExtensionInstanceViewResponseStatus;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the Machine Extension Instance View.
 * 
 */
public final class MachineExtensionInstanceViewResponse extends com.pulumi.resources.InvokeArgs {

    public static final MachineExtensionInstanceViewResponse Empty = new MachineExtensionInstanceViewResponse();

    /**
     * The machine extension name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Instance view status.
     * 
     */
    @Import(name="status")
      private final @Nullable MachineExtensionInstanceViewResponseStatus status;

    public Optional<MachineExtensionInstanceViewResponseStatus> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Specifies the type of the extension; an example is &#34;CustomScriptExtension&#34;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @Import(name="typeHandlerVersion", required=true)
      private final String typeHandlerVersion;

    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public MachineExtensionInstanceViewResponse(
        String name,
        @Nullable MachineExtensionInstanceViewResponseStatus status,
        String type,
        String typeHandlerVersion) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.status = status;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion, "expected parameter 'typeHandlerVersion' to be non-null");
    }

    private MachineExtensionInstanceViewResponse() {
        this.name = null;
        this.status = null;
        this.type = null;
        this.typeHandlerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineExtensionInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable MachineExtensionInstanceViewResponseStatus status;
        private String type;
        private String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineExtensionInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder status(@Nullable MachineExtensionInstanceViewResponseStatus status) {
            this.status = status;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
            return this;
        }        public MachineExtensionInstanceViewResponse build() {
            return new MachineExtensionInstanceViewResponse(name, status, type, typeHandlerVersion);
        }
    }
}
