// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Mobility Service update details.
 * 
 */
public final class MobilityServiceUpdateResponse extends com.pulumi.resources.InvokeArgs {

    public static final MobilityServiceUpdateResponse Empty = new MobilityServiceUpdateResponse();

    /**
     * The OS type.
     * 
     */
    @Import(name="osType")
    private @Nullable String osType;

    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * The reboot status of the update - whether it is required or not.
     * 
     */
    @Import(name="rebootStatus")
    private @Nullable String rebootStatus;

    public Optional<String> rebootStatus() {
        return Optional.ofNullable(this.rebootStatus);
    }

    /**
     * The version of the latest update.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private MobilityServiceUpdateResponse() {}

    private MobilityServiceUpdateResponse(MobilityServiceUpdateResponse $) {
        this.osType = $.osType;
        this.rebootStatus = $.rebootStatus;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MobilityServiceUpdateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MobilityServiceUpdateResponse $;

        public Builder() {
            $ = new MobilityServiceUpdateResponse();
        }

        public Builder(MobilityServiceUpdateResponse defaults) {
            $ = new MobilityServiceUpdateResponse(Objects.requireNonNull(defaults));
        }

        public Builder osType(@Nullable String osType) {
            $.osType = osType;
            return this;
        }

        public Builder rebootStatus(@Nullable String rebootStatus) {
            $.rebootStatus = rebootStatus;
            return this;
        }

        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public MobilityServiceUpdateResponse build() {
            return $;
        }
    }

}
