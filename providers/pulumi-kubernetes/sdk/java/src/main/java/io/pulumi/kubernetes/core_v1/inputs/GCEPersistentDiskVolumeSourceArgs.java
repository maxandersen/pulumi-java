// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GCEPersistentDiskVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GCEPersistentDiskVolumeSourceArgs Empty = new GCEPersistentDiskVolumeSourceArgs();

    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    @InputImport(name="partition")
    private final @Nullable Input<Integer> partition;

    public Input<Integer> getPartition() {
        return this.partition == null ? Input.empty() : this.partition;
    }

    @InputImport(name="pdName", required=true)
    private final Input<String> pdName;

    public Input<String> getPdName() {
        return this.pdName;
    }

    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    public GCEPersistentDiskVolumeSourceArgs(
        @Nullable Input<String> fsType,
        @Nullable Input<Integer> partition,
        Input<String> pdName,
        @Nullable Input<Boolean> readOnly) {
        this.fsType = fsType;
        this.partition = partition;
        this.pdName = Objects.requireNonNull(pdName, "expected parameter 'pdName' to be non-null");
        this.readOnly = readOnly;
    }

    private GCEPersistentDiskVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.partition = Input.empty();
        this.pdName = Input.empty();
        this.readOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GCEPersistentDiskVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private @Nullable Input<Integer> partition;
        private Input<String> pdName;
        private @Nullable Input<Boolean> readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GCEPersistentDiskVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.partition = defaults.partition;
    	      this.pdName = defaults.pdName;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setPartition(@Nullable Input<Integer> partition) {
            this.partition = partition;
            return this;
        }

        public Builder setPartition(@Nullable Integer partition) {
            this.partition = Input.ofNullable(partition);
            return this;
        }

        public Builder setPdName(Input<String> pdName) {
            this.pdName = Objects.requireNonNull(pdName);
            return this;
        }

        public Builder setPdName(String pdName) {
            this.pdName = Input.of(Objects.requireNonNull(pdName));
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

        public GCEPersistentDiskVolumeSourceArgs build() {
            return new GCEPersistentDiskVolumeSourceArgs(fsType, partition, pdName, readOnly);
        }
    }
}
