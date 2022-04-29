// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Uploads files to VMs (Linux, Windows). Corresponds to Packer file provisioner
 * 
 */
public final class ImageTemplateFileCustomizerArgs extends ResourceArgs {

    public static final ImageTemplateFileCustomizerArgs Empty = new ImageTemplateFileCustomizerArgs();

    /**
     * The absolute path to a file (with nested directory structures already created) where the file (from sourceUri) will be uploaded to in the VM
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    /**
     * @return The absolute path to a file (with nested directory structures already created) where the file (from sourceUri) will be uploaded to in the VM
     * 
     */
    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly Name to provide context on what this customization step does
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * SHA256 checksum of the file provided in the sourceUri field above
     * 
     */
    @Import(name="sha256Checksum")
    private @Nullable Output<String> sha256Checksum;

    /**
     * @return SHA256 checksum of the file provided in the sourceUri field above
     * 
     */
    public Optional<Output<String>> sha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }

    /**
     * The URI of the file to be uploaded for customizing the VM. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    @Import(name="sourceUri")
    private @Nullable Output<String> sourceUri;

    /**
     * @return The URI of the file to be uploaded for customizing the VM. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    public Optional<Output<String>> sourceUri() {
        return Optional.ofNullable(this.sourceUri);
    }

    /**
     * The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;File&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;File&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ImageTemplateFileCustomizerArgs() {}

    private ImageTemplateFileCustomizerArgs(ImageTemplateFileCustomizerArgs $) {
        this.destination = $.destination;
        this.name = $.name;
        this.sha256Checksum = $.sha256Checksum;
        this.sourceUri = $.sourceUri;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageTemplateFileCustomizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageTemplateFileCustomizerArgs $;

        public Builder() {
            $ = new ImageTemplateFileCustomizerArgs();
        }

        public Builder(ImageTemplateFileCustomizerArgs defaults) {
            $ = new ImageTemplateFileCustomizerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination The absolute path to a file (with nested directory structures already created) where the file (from sourceUri) will be uploaded to in the VM
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination The absolute path to a file (with nested directory structures already created) where the file (from sourceUri) will be uploaded to in the VM
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param name Friendly Name to provide context on what this customization step does
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly Name to provide context on what this customization step does
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sha256Checksum SHA256 checksum of the file provided in the sourceUri field above
         * 
         * @return builder
         * 
         */
        public Builder sha256Checksum(@Nullable Output<String> sha256Checksum) {
            $.sha256Checksum = sha256Checksum;
            return this;
        }

        /**
         * @param sha256Checksum SHA256 checksum of the file provided in the sourceUri field above
         * 
         * @return builder
         * 
         */
        public Builder sha256Checksum(String sha256Checksum) {
            return sha256Checksum(Output.of(sha256Checksum));
        }

        /**
         * @param sourceUri The URI of the file to be uploaded for customizing the VM. It can be a github link, SAS URI for Azure Storage, etc
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(@Nullable Output<String> sourceUri) {
            $.sourceUri = sourceUri;
            return this;
        }

        /**
         * @param sourceUri The URI of the file to be uploaded for customizing the VM. It can be a github link, SAS URI for Azure Storage, etc
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(String sourceUri) {
            return sourceUri(Output.of(sourceUri));
        }

        /**
         * @param type The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
         * Expected value is &#39;File&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
         * Expected value is &#39;File&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ImageTemplateFileCustomizerArgs build() {
            $.sha256Checksum = Codegen.stringProp("sha256Checksum").output().arg($.sha256Checksum).def("").getNullable();
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
