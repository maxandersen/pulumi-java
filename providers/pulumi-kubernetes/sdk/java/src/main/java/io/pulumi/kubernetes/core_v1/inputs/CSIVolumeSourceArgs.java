// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CSIVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CSIVolumeSourceArgs Empty = new CSIVolumeSourceArgs();

    @InputImport(name="driver", required=true)
    private final Input<String> driver;

    public Input<String> getDriver() {
        return this.driver;
    }

    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    @InputImport(name="nodePublishSecretRef")
    private final @Nullable Input<LocalObjectReferenceArgs> nodePublishSecretRef;

    public Input<LocalObjectReferenceArgs> getNodePublishSecretRef() {
        return this.nodePublishSecretRef == null ? Input.empty() : this.nodePublishSecretRef;
    }

    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    @InputImport(name="volumeAttributes")
    private final @Nullable Input<Map<String,String>> volumeAttributes;

    public Input<Map<String,String>> getVolumeAttributes() {
        return this.volumeAttributes == null ? Input.empty() : this.volumeAttributes;
    }

    public CSIVolumeSourceArgs(
        Input<String> driver,
        @Nullable Input<String> fsType,
        @Nullable Input<LocalObjectReferenceArgs> nodePublishSecretRef,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<Map<String,String>> volumeAttributes) {
        this.driver = Objects.requireNonNull(driver, "expected parameter 'driver' to be non-null");
        this.fsType = fsType;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
    }

    private CSIVolumeSourceArgs() {
        this.driver = Input.empty();
        this.fsType = Input.empty();
        this.nodePublishSecretRef = Input.empty();
        this.readOnly = Input.empty();
        this.volumeAttributes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> driver;
        private @Nullable Input<String> fsType;
        private @Nullable Input<LocalObjectReferenceArgs> nodePublishSecretRef;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<Map<String,String>> volumeAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.nodePublishSecretRef = defaults.nodePublishSecretRef;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeAttributes = defaults.volumeAttributes;
        }

        public Builder setDriver(Input<String> driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }

        public Builder setDriver(String driver) {
            this.driver = Input.of(Objects.requireNonNull(driver));
            return this;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setNodePublishSecretRef(@Nullable Input<LocalObjectReferenceArgs> nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }

        public Builder setNodePublishSecretRef(@Nullable LocalObjectReferenceArgs nodePublishSecretRef) {
            this.nodePublishSecretRef = Input.ofNullable(nodePublishSecretRef);
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setVolumeAttributes(@Nullable Input<Map<String,String>> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }

        public Builder setVolumeAttributes(@Nullable Map<String,String> volumeAttributes) {
            this.volumeAttributes = Input.ofNullable(volumeAttributes);
            return this;
        }

        public CSIVolumeSourceArgs build() {
            return new CSIVolumeSourceArgs(driver, fsType, nodePublishSecretRef, readOnly, volumeAttributes);
        }
    }
}
