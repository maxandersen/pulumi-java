// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs;
import com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmiArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmiArgs Empty = new AmiArgs();

    /**
     * Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
     * 
     */
    @Import(name="architecture")
    private @Nullable Output<String> architecture;

    public Optional<Output<String>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * A longer, human-readable description for the AMI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ebsBlockDevices")
    private @Nullable Output<List<AmiEbsBlockDeviceArgs>> ebsBlockDevices;

    public Optional<Output<List<AmiEbsBlockDeviceArgs>>> ebsBlockDevices() {
        return Optional.ofNullable(this.ebsBlockDevices);
    }

    /**
     * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
     * 
     */
    @Import(name="enaSupport")
    private @Nullable Output<Boolean> enaSupport;

    public Optional<Output<Boolean>> enaSupport() {
        return Optional.ofNullable(this.enaSupport);
    }

    /**
     * Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ephemeralBlockDevices")
    private @Nullable Output<List<AmiEphemeralBlockDeviceArgs>> ephemeralBlockDevices;

    public Optional<Output<List<AmiEphemeralBlockDeviceArgs>>> ephemeralBlockDevices() {
        return Optional.ofNullable(this.ephemeralBlockDevices);
    }

    /**
     * Path to an S3 object containing an image manifest, e.g., created
     * by the `ec2-upload-bundle` command in the EC2 command line tools.
     * 
     */
    @Import(name="imageLocation")
    private @Nullable Output<String> imageLocation;

    public Optional<Output<String>> imageLocation() {
        return Optional.ofNullable(this.imageLocation);
    }

    /**
     * The id of the kernel image (AKI) that will be used as the paravirtual
     * kernel in created instances.
     * 
     */
    @Import(name="kernelId")
    private @Nullable Output<String> kernelId;

    public Optional<Output<String>> kernelId() {
        return Optional.ofNullable(this.kernelId);
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The id of an initrd image (ARI) that will be used when booting the
     * created instances.
     * 
     */
    @Import(name="ramdiskId")
    private @Nullable Output<String> ramdiskId;

    public Optional<Output<String>> ramdiskId() {
        return Optional.ofNullable(this.ramdiskId);
    }

    /**
     * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
     * 
     */
    @Import(name="rootDeviceName")
    private @Nullable Output<String> rootDeviceName;

    public Optional<Output<String>> rootDeviceName() {
        return Optional.ofNullable(this.rootDeviceName);
    }

    /**
     * When set to &#34;simple&#34; (the default), enables enhanced networking
     * for created instances. No other value is supported at this time.
     * 
     */
    @Import(name="sriovNetSupport")
    private @Nullable Output<String> sriovNetSupport;

    public Optional<Output<String>> sriovNetSupport() {
        return Optional.ofNullable(this.sriovNetSupport);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Keyword to choose what virtualization mode created instances
     * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
     * changes the set of further arguments that are required, as described below.
     * 
     */
    @Import(name="virtualizationType")
    private @Nullable Output<String> virtualizationType;

    public Optional<Output<String>> virtualizationType() {
        return Optional.ofNullable(this.virtualizationType);
    }

    private AmiArgs() {}

    private AmiArgs(AmiArgs $) {
        this.architecture = $.architecture;
        this.description = $.description;
        this.ebsBlockDevices = $.ebsBlockDevices;
        this.enaSupport = $.enaSupport;
        this.ephemeralBlockDevices = $.ephemeralBlockDevices;
        this.imageLocation = $.imageLocation;
        this.kernelId = $.kernelId;
        this.name = $.name;
        this.ramdiskId = $.ramdiskId;
        this.rootDeviceName = $.rootDeviceName;
        this.sriovNetSupport = $.sriovNetSupport;
        this.tags = $.tags;
        this.virtualizationType = $.virtualizationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmiArgs $;

        public Builder() {
            $ = new AmiArgs();
        }

        public Builder(AmiArgs defaults) {
            $ = new AmiArgs(Objects.requireNonNull(defaults));
        }

        public Builder architecture(@Nullable Output<String> architecture) {
            $.architecture = architecture;
            return this;
        }

        public Builder architecture(String architecture) {
            return architecture(Output.of(architecture));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder ebsBlockDevices(@Nullable Output<List<AmiEbsBlockDeviceArgs>> ebsBlockDevices) {
            $.ebsBlockDevices = ebsBlockDevices;
            return this;
        }

        public Builder ebsBlockDevices(List<AmiEbsBlockDeviceArgs> ebsBlockDevices) {
            return ebsBlockDevices(Output.of(ebsBlockDevices));
        }

        public Builder ebsBlockDevices(AmiEbsBlockDeviceArgs... ebsBlockDevices) {
            return ebsBlockDevices(List.of(ebsBlockDevices));
        }

        public Builder enaSupport(@Nullable Output<Boolean> enaSupport) {
            $.enaSupport = enaSupport;
            return this;
        }

        public Builder enaSupport(Boolean enaSupport) {
            return enaSupport(Output.of(enaSupport));
        }

        public Builder ephemeralBlockDevices(@Nullable Output<List<AmiEphemeralBlockDeviceArgs>> ephemeralBlockDevices) {
            $.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }

        public Builder ephemeralBlockDevices(List<AmiEphemeralBlockDeviceArgs> ephemeralBlockDevices) {
            return ephemeralBlockDevices(Output.of(ephemeralBlockDevices));
        }

        public Builder ephemeralBlockDevices(AmiEphemeralBlockDeviceArgs... ephemeralBlockDevices) {
            return ephemeralBlockDevices(List.of(ephemeralBlockDevices));
        }

        public Builder imageLocation(@Nullable Output<String> imageLocation) {
            $.imageLocation = imageLocation;
            return this;
        }

        public Builder imageLocation(String imageLocation) {
            return imageLocation(Output.of(imageLocation));
        }

        public Builder kernelId(@Nullable Output<String> kernelId) {
            $.kernelId = kernelId;
            return this;
        }

        public Builder kernelId(String kernelId) {
            return kernelId(Output.of(kernelId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder ramdiskId(@Nullable Output<String> ramdiskId) {
            $.ramdiskId = ramdiskId;
            return this;
        }

        public Builder ramdiskId(String ramdiskId) {
            return ramdiskId(Output.of(ramdiskId));
        }

        public Builder rootDeviceName(@Nullable Output<String> rootDeviceName) {
            $.rootDeviceName = rootDeviceName;
            return this;
        }

        public Builder rootDeviceName(String rootDeviceName) {
            return rootDeviceName(Output.of(rootDeviceName));
        }

        public Builder sriovNetSupport(@Nullable Output<String> sriovNetSupport) {
            $.sriovNetSupport = sriovNetSupport;
            return this;
        }

        public Builder sriovNetSupport(String sriovNetSupport) {
            return sriovNetSupport(Output.of(sriovNetSupport));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder virtualizationType(@Nullable Output<String> virtualizationType) {
            $.virtualizationType = virtualizationType;
            return this;
        }

        public Builder virtualizationType(String virtualizationType) {
            return virtualizationType(Output.of(virtualizationType));
        }

        public AmiArgs build() {
            return $;
        }
    }

}
