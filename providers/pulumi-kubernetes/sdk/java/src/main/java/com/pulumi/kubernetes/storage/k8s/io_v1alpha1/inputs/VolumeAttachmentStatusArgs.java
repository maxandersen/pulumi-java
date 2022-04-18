// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.storage.k8s.io_v1alpha1.inputs.VolumeErrorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VolumeAttachmentStatus is the status of a VolumeAttachment request.
 * 
 */
public final class VolumeAttachmentStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentStatusArgs Empty = new VolumeAttachmentStatusArgs();

    /**
     * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    @Import(name="attachError")
      private final @Nullable Output<VolumeErrorArgs> attachError;

    public Output<VolumeErrorArgs> attachError() {
        return this.attachError == null ? Codegen.empty() : this.attachError;
    }

    /**
     * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    @Import(name="attached", required=true)
      private final Output<Boolean> attached;

    public Output<Boolean> attached() {
        return this.attached;
    }

    /**
     * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    @Import(name="attachmentMetadata")
      private final @Nullable Output<Map<String,String>> attachmentMetadata;

    public Output<Map<String,String>> attachmentMetadata() {
        return this.attachmentMetadata == null ? Codegen.empty() : this.attachmentMetadata;
    }

    /**
     * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
     * 
     */
    @Import(name="detachError")
      private final @Nullable Output<VolumeErrorArgs> detachError;

    public Output<VolumeErrorArgs> detachError() {
        return this.detachError == null ? Codegen.empty() : this.detachError;
    }

    public VolumeAttachmentStatusArgs(
        @Nullable Output<VolumeErrorArgs> attachError,
        Output<Boolean> attached,
        @Nullable Output<Map<String,String>> attachmentMetadata,
        @Nullable Output<VolumeErrorArgs> detachError) {
        this.attachError = attachError;
        this.attached = Objects.requireNonNull(attached, "expected parameter 'attached' to be non-null");
        this.attachmentMetadata = attachmentMetadata;
        this.detachError = detachError;
    }

    private VolumeAttachmentStatusArgs() {
        this.attachError = Codegen.empty();
        this.attached = Codegen.empty();
        this.attachmentMetadata = Codegen.empty();
        this.detachError = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VolumeErrorArgs> attachError;
        private Output<Boolean> attached;
        private @Nullable Output<Map<String,String>> attachmentMetadata;
        private @Nullable Output<VolumeErrorArgs> detachError;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachError = defaults.attachError;
    	      this.attached = defaults.attached;
    	      this.attachmentMetadata = defaults.attachmentMetadata;
    	      this.detachError = defaults.detachError;
        }

        public Builder attachError(@Nullable Output<VolumeErrorArgs> attachError) {
            this.attachError = attachError;
            return this;
        }
        public Builder attachError(@Nullable VolumeErrorArgs attachError) {
            this.attachError = Codegen.ofNullable(attachError);
            return this;
        }
        public Builder attached(Output<Boolean> attached) {
            this.attached = Objects.requireNonNull(attached);
            return this;
        }
        public Builder attached(Boolean attached) {
            this.attached = Output.of(Objects.requireNonNull(attached));
            return this;
        }
        public Builder attachmentMetadata(@Nullable Output<Map<String,String>> attachmentMetadata) {
            this.attachmentMetadata = attachmentMetadata;
            return this;
        }
        public Builder attachmentMetadata(@Nullable Map<String,String> attachmentMetadata) {
            this.attachmentMetadata = Codegen.ofNullable(attachmentMetadata);
            return this;
        }
        public Builder detachError(@Nullable Output<VolumeErrorArgs> detachError) {
            this.detachError = detachError;
            return this;
        }
        public Builder detachError(@Nullable VolumeErrorArgs detachError) {
            this.detachError = Codegen.ofNullable(detachError);
            return this;
        }        public VolumeAttachmentStatusArgs build() {
            return new VolumeAttachmentStatusArgs(attachError, attached, attachmentMetadata, detachError);
        }
    }
}
