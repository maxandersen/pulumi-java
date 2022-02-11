// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.storage.k8s.io_v1.outputs.VolumeError;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeAttachmentStatus {
    private final @Nullable VolumeError attachError;
    private final Boolean attached;
    private final @Nullable Map<String,String> attachmentMetadata;
    private final @Nullable VolumeError detachError;

    @OutputCustomType.Constructor({"attachError","attached","attachmentMetadata","detachError"})
    private VolumeAttachmentStatus(
        @Nullable VolumeError attachError,
        Boolean attached,
        @Nullable Map<String,String> attachmentMetadata,
        @Nullable VolumeError detachError) {
        this.attachError = attachError;
        this.attached = Objects.requireNonNull(attached);
        this.attachmentMetadata = attachmentMetadata;
        this.detachError = detachError;
    }

    public Optional<VolumeError> getAttachError() {
        return Optional.ofNullable(this.attachError);
    }
    public Boolean getAttached() {
        return this.attached;
    }
    public Map<String,String> getAttachmentMetadata() {
        return this.attachmentMetadata == null ? Map.of() : this.attachmentMetadata;
    }
    public Optional<VolumeError> getDetachError() {
        return Optional.ofNullable(this.detachError);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VolumeError attachError;
        private Boolean attached;
        private @Nullable Map<String,String> attachmentMetadata;
        private @Nullable VolumeError detachError;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachError = defaults.attachError;
    	      this.attached = defaults.attached;
    	      this.attachmentMetadata = defaults.attachmentMetadata;
    	      this.detachError = defaults.detachError;
        }

        public Builder setAttachError(@Nullable VolumeError attachError) {
            this.attachError = attachError;
            return this;
        }

        public Builder setAttached(Boolean attached) {
            this.attached = Objects.requireNonNull(attached);
            return this;
        }

        public Builder setAttachmentMetadata(@Nullable Map<String,String> attachmentMetadata) {
            this.attachmentMetadata = attachmentMetadata;
            return this;
        }

        public Builder setDetachError(@Nullable VolumeError detachError) {
            this.detachError = detachError;
            return this;
        }

        public VolumeAttachmentStatus build() {
            return new VolumeAttachmentStatus(attachError, attached, attachmentMetadata, detachError);
        }
    }
}
