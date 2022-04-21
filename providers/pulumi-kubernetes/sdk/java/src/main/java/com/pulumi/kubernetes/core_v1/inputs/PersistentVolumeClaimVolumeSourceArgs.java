// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PersistentVolumeClaimVolumeSource references the user&#39;s PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
 * 
 */
public final class PersistentVolumeClaimVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeClaimVolumeSourceArgs Empty = new PersistentVolumeClaimVolumeSourceArgs();

    /**
     * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * 
     */
    @Import(name="claimName", required=true)
    private Output<String> claimName;

    public Output<String> claimName() {
        return this.claimName;
    }

    /**
     * Will force the ReadOnly setting in VolumeMounts. Default false.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    private PersistentVolumeClaimVolumeSourceArgs() {}

    private PersistentVolumeClaimVolumeSourceArgs(PersistentVolumeClaimVolumeSourceArgs $) {
        this.claimName = $.claimName;
        this.readOnly = $.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PersistentVolumeClaimVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PersistentVolumeClaimVolumeSourceArgs $;

        public Builder() {
            $ = new PersistentVolumeClaimVolumeSourceArgs();
        }

        public Builder(PersistentVolumeClaimVolumeSourceArgs defaults) {
            $ = new PersistentVolumeClaimVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder claimName(Output<String> claimName) {
            $.claimName = claimName;
            return this;
        }

        public Builder claimName(String claimName) {
            return claimName(Output.of(claimName));
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public PersistentVolumeClaimVolumeSourceArgs build() {
            $.claimName = Objects.requireNonNull($.claimName, "expected parameter 'claimName' to be non-null");
            return $;
        }
    }

}
