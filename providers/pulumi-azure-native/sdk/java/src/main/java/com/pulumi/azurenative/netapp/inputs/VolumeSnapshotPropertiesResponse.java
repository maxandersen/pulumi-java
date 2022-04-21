// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Volume Snapshot Properties
 * 
 */
public final class VolumeSnapshotPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final VolumeSnapshotPropertiesResponse Empty = new VolumeSnapshotPropertiesResponse();

    /**
     * Snapshot Policy ResourceId
     * 
     */
    @Import(name="snapshotPolicyId")
    private @Nullable String snapshotPolicyId;

    public Optional<String> snapshotPolicyId() {
        return Optional.ofNullable(this.snapshotPolicyId);
    }

    private VolumeSnapshotPropertiesResponse() {}

    private VolumeSnapshotPropertiesResponse(VolumeSnapshotPropertiesResponse $) {
        this.snapshotPolicyId = $.snapshotPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeSnapshotPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeSnapshotPropertiesResponse $;

        public Builder() {
            $ = new VolumeSnapshotPropertiesResponse();
        }

        public Builder(VolumeSnapshotPropertiesResponse defaults) {
            $ = new VolumeSnapshotPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder snapshotPolicyId(@Nullable String snapshotPolicyId) {
            $.snapshotPolicyId = snapshotPolicyId;
            return this;
        }

        public VolumeSnapshotPropertiesResponse build() {
            return $;
        }
    }

}
