// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.inputs.LinuxOperatingSystemProfileResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Linux operation systems profile.
 * 
 */
public final class OsProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final OsProfileResponse Empty = new OsProfileResponse();

    /**
     * The Linux OS profile.
     * 
     */
    @Import(name="linuxOperatingSystemProfile")
    private @Nullable LinuxOperatingSystemProfileResponse linuxOperatingSystemProfile;

    public Optional<LinuxOperatingSystemProfileResponse> linuxOperatingSystemProfile() {
        return Optional.ofNullable(this.linuxOperatingSystemProfile);
    }

    private OsProfileResponse() {}

    private OsProfileResponse(OsProfileResponse $) {
        this.linuxOperatingSystemProfile = $.linuxOperatingSystemProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsProfileResponse $;

        public Builder() {
            $ = new OsProfileResponse();
        }

        public Builder(OsProfileResponse defaults) {
            $ = new OsProfileResponse(Objects.requireNonNull(defaults));
        }

        public Builder linuxOperatingSystemProfile(@Nullable LinuxOperatingSystemProfileResponse linuxOperatingSystemProfile) {
            $.linuxOperatingSystemProfile = linuxOperatingSystemProfile;
            return this;
        }

        public OsProfileResponse build() {
            return $;
        }
    }

}
