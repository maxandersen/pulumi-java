// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the OS Disk.
 * 
 */
public final class OSDiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSDiskDetailsResponse Empty = new OSDiskDetailsResponse();

    /**
     * The type of the OS on the VM.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> osType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * The id of the disk containing the OS.
     * 
     */
    @Import(name="osVhdId")
      private final @Nullable String osVhdId;

    public Optional<String> osVhdId() {
        return this.osVhdId == null ? Optional.empty() : Optional.ofNullable(this.osVhdId);
    }

    /**
     * The OS disk VHD name.
     * 
     */
    @Import(name="vhdName")
      private final @Nullable String vhdName;

    public Optional<String> vhdName() {
        return this.vhdName == null ? Optional.empty() : Optional.ofNullable(this.vhdName);
    }

    public OSDiskDetailsResponse(
        @Nullable String osType,
        @Nullable String osVhdId,
        @Nullable String vhdName) {
        this.osType = osType;
        this.osVhdId = osVhdId;
        this.vhdName = vhdName;
    }

    private OSDiskDetailsResponse() {
        this.osType = null;
        this.osVhdId = null;
        this.vhdName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String osType;
        private @Nullable String osVhdId;
        private @Nullable String vhdName;

        public Builder() {
    	      // Empty
        }

        public Builder(OSDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osType = defaults.osType;
    	      this.osVhdId = defaults.osVhdId;
    	      this.vhdName = defaults.vhdName;
        }

        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder osVhdId(@Nullable String osVhdId) {
            this.osVhdId = osVhdId;
            return this;
        }
        public Builder vhdName(@Nullable String vhdName) {
            this.vhdName = vhdName;
            return this;
        }        public OSDiskDetailsResponse build() {
            return new OSDiskDetailsResponse(osType, osVhdId, vhdName);
        }
    }
}
