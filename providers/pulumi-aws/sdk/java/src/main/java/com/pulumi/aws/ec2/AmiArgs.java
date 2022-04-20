// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs;
import com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AmiArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmiArgs Empty = new AmiArgs();

    /**
     * Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
     * 
     */
    @Import(name="architecture")
      private final @Nullable Output<String> architecture;

    public Output<String> architecture() {
        return this.architecture == null ? Codegen.empty() : this.architecture;
    }

    /**
     * A longer, human-readable description for the AMI.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ebsBlockDevices")
      private final @Nullable Output<List<AmiEbsBlockDeviceArgs>> ebsBlockDevices;

    public Output<List<AmiEbsBlockDeviceArgs>> ebsBlockDevices() {
        return this.ebsBlockDevices == null ? Codegen.empty() : this.ebsBlockDevices;
    }

    /**
     * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
     * 
     */
    @Import(name="enaSupport")
      private final @Nullable Output<Boolean> enaSupport;

    public Output<Boolean> enaSupport() {
        return this.enaSupport == null ? Codegen.empty() : this.enaSupport;
    }

    /**
     * Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ephemeralBlockDevices")
      private final @Nullable Output<List<AmiEphemeralBlockDeviceArgs>> ephemeralBlockDevices;

    public Output<List<AmiEphemeralBlockDeviceArgs>> ephemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? Codegen.empty() : this.ephemeralBlockDevices;
    }

    /**
     * Path to an S3 object containing an image manifest, e.g., created
     * by the `ec2-upload-bundle` command in the EC2 command line tools.
     * 
     */
    @Import(name="imageLocation")
      private final @Nullable Output<String> imageLocation;

    public Output<String> imageLocation() {
        return this.imageLocation == null ? Codegen.empty() : this.imageLocation;
    }

    /**
     * The id of the kernel image (AKI) that will be used as the paravirtual
     * kernel in created instances.
     * 
     */
    @Import(name="kernelId")
      private final @Nullable Output<String> kernelId;

    public Output<String> kernelId() {
        return this.kernelId == null ? Codegen.empty() : this.kernelId;
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The id of an initrd image (ARI) that will be used when booting the
     * created instances.
     * 
     */
    @Import(name="ramdiskId")
      private final @Nullable Output<String> ramdiskId;

    public Output<String> ramdiskId() {
        return this.ramdiskId == null ? Codegen.empty() : this.ramdiskId;
    }

    /**
     * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
     * 
     */
    @Import(name="rootDeviceName")
      private final @Nullable Output<String> rootDeviceName;

    public Output<String> rootDeviceName() {
        return this.rootDeviceName == null ? Codegen.empty() : this.rootDeviceName;
    }

    /**
     * When set to &#34;simple&#34; (the default), enables enhanced networking
     * for created instances. No other value is supported at this time.
     * 
     */
    @Import(name="sriovNetSupport")
      private final @Nullable Output<String> sriovNetSupport;

    public Output<String> sriovNetSupport() {
        return this.sriovNetSupport == null ? Codegen.empty() : this.sriovNetSupport;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Keyword to choose what virtualization mode created instances
     * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
     * changes the set of further arguments that are required, as described below.
     * 
     */
    @Import(name="virtualizationType")
      private final @Nullable Output<String> virtualizationType;

    public Output<String> virtualizationType() {
        return this.virtualizationType == null ? Codegen.empty() : this.virtualizationType;
    }

    public AmiArgs(
        @Nullable Output<String> architecture,
        @Nullable Output<String> description,
        @Nullable Output<List<AmiEbsBlockDeviceArgs>> ebsBlockDevices,
        @Nullable Output<Boolean> enaSupport,
        @Nullable Output<List<AmiEphemeralBlockDeviceArgs>> ephemeralBlockDevices,
        @Nullable Output<String> imageLocation,
        @Nullable Output<String> kernelId,
        @Nullable Output<String> name,
        @Nullable Output<String> ramdiskId,
        @Nullable Output<String> rootDeviceName,
        @Nullable Output<String> sriovNetSupport,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> virtualizationType) {
        this.architecture = architecture;
        this.description = description;
        this.ebsBlockDevices = ebsBlockDevices;
        this.enaSupport = enaSupport;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.imageLocation = imageLocation;
        this.kernelId = kernelId;
        this.name = name;
        this.ramdiskId = ramdiskId;
        this.rootDeviceName = rootDeviceName;
        this.sriovNetSupport = sriovNetSupport;
        this.tags = tags;
        this.virtualizationType = virtualizationType;
    }

    private AmiArgs() {
        this.architecture = Codegen.empty();
        this.description = Codegen.empty();
        this.ebsBlockDevices = Codegen.empty();
        this.enaSupport = Codegen.empty();
        this.ephemeralBlockDevices = Codegen.empty();
        this.imageLocation = Codegen.empty();
        this.kernelId = Codegen.empty();
        this.name = Codegen.empty();
        this.ramdiskId = Codegen.empty();
        this.rootDeviceName = Codegen.empty();
        this.sriovNetSupport = Codegen.empty();
        this.tags = Codegen.empty();
        this.virtualizationType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> architecture;
        private @Nullable Output<String> description;
        private @Nullable Output<List<AmiEbsBlockDeviceArgs>> ebsBlockDevices;
        private @Nullable Output<Boolean> enaSupport;
        private @Nullable Output<List<AmiEphemeralBlockDeviceArgs>> ephemeralBlockDevices;
        private @Nullable Output<String> imageLocation;
        private @Nullable Output<String> kernelId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ramdiskId;
        private @Nullable Output<String> rootDeviceName;
        private @Nullable Output<String> sriovNetSupport;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> virtualizationType;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.description = defaults.description;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.enaSupport = defaults.enaSupport;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.imageLocation = defaults.imageLocation;
    	      this.kernelId = defaults.kernelId;
    	      this.name = defaults.name;
    	      this.ramdiskId = defaults.ramdiskId;
    	      this.rootDeviceName = defaults.rootDeviceName;
    	      this.sriovNetSupport = defaults.sriovNetSupport;
    	      this.tags = defaults.tags;
    	      this.virtualizationType = defaults.virtualizationType;
        }

        public Builder architecture(@Nullable Output<String> architecture) {
            this.architecture = architecture;
            return this;
        }
        public Builder architecture(@Nullable String architecture) {
            this.architecture = Codegen.ofNullable(architecture);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ebsBlockDevices(@Nullable Output<List<AmiEbsBlockDeviceArgs>> ebsBlockDevices) {
            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }
        public Builder ebsBlockDevices(@Nullable List<AmiEbsBlockDeviceArgs> ebsBlockDevices) {
            this.ebsBlockDevices = Codegen.ofNullable(ebsBlockDevices);
            return this;
        }
        public Builder ebsBlockDevices(AmiEbsBlockDeviceArgs... ebsBlockDevices) {
            return ebsBlockDevices(List.of(ebsBlockDevices));
        }
        public Builder enaSupport(@Nullable Output<Boolean> enaSupport) {
            this.enaSupport = enaSupport;
            return this;
        }
        public Builder enaSupport(@Nullable Boolean enaSupport) {
            this.enaSupport = Codegen.ofNullable(enaSupport);
            return this;
        }
        public Builder ephemeralBlockDevices(@Nullable Output<List<AmiEphemeralBlockDeviceArgs>> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }
        public Builder ephemeralBlockDevices(@Nullable List<AmiEphemeralBlockDeviceArgs> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Codegen.ofNullable(ephemeralBlockDevices);
            return this;
        }
        public Builder ephemeralBlockDevices(AmiEphemeralBlockDeviceArgs... ephemeralBlockDevices) {
            return ephemeralBlockDevices(List.of(ephemeralBlockDevices));
        }
        public Builder imageLocation(@Nullable Output<String> imageLocation) {
            this.imageLocation = imageLocation;
            return this;
        }
        public Builder imageLocation(@Nullable String imageLocation) {
            this.imageLocation = Codegen.ofNullable(imageLocation);
            return this;
        }
        public Builder kernelId(@Nullable Output<String> kernelId) {
            this.kernelId = kernelId;
            return this;
        }
        public Builder kernelId(@Nullable String kernelId) {
            this.kernelId = Codegen.ofNullable(kernelId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder ramdiskId(@Nullable Output<String> ramdiskId) {
            this.ramdiskId = ramdiskId;
            return this;
        }
        public Builder ramdiskId(@Nullable String ramdiskId) {
            this.ramdiskId = Codegen.ofNullable(ramdiskId);
            return this;
        }
        public Builder rootDeviceName(@Nullable Output<String> rootDeviceName) {
            this.rootDeviceName = rootDeviceName;
            return this;
        }
        public Builder rootDeviceName(@Nullable String rootDeviceName) {
            this.rootDeviceName = Codegen.ofNullable(rootDeviceName);
            return this;
        }
        public Builder sriovNetSupport(@Nullable Output<String> sriovNetSupport) {
            this.sriovNetSupport = sriovNetSupport;
            return this;
        }
        public Builder sriovNetSupport(@Nullable String sriovNetSupport) {
            this.sriovNetSupport = Codegen.ofNullable(sriovNetSupport);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder virtualizationType(@Nullable Output<String> virtualizationType) {
            this.virtualizationType = virtualizationType;
            return this;
        }
        public Builder virtualizationType(@Nullable String virtualizationType) {
            this.virtualizationType = Codegen.ofNullable(virtualizationType);
            return this;
        }        public AmiArgs build() {
            return new AmiArgs(architecture, description, ebsBlockDevices, enaSupport, ephemeralBlockDevices, imageLocation, kernelId, name, ramdiskId, rootDeviceName, sriovNetSupport, tags, virtualizationType);
        }
    }
}
