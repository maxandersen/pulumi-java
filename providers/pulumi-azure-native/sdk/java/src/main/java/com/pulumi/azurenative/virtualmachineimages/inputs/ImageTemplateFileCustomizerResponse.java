// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Uploads files to VMs (Linux, Windows). Corresponds to Packer file provisioner
 * 
 */
public final class ImageTemplateFileCustomizerResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageTemplateFileCustomizerResponse Empty = new ImageTemplateFileCustomizerResponse();

    /**
     * The absolute path to a file (with nested directory structures already created) where the file (from sourceUri) will be uploaded to in the VM
     * 
     */
    @Import(name="destination")
    private @Nullable String destination;

    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * SHA256 checksum of the file provided in the sourceUri field above
     * 
     */
    @Import(name="sha256Checksum")
    private @Nullable String sha256Checksum;

    public Optional<String> sha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }

    /**
     * The URI of the file to be uploaded for customizing the VM. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    @Import(name="sourceUri")
    private @Nullable String sourceUri;

    public Optional<String> sourceUri() {
        return Optional.ofNullable(this.sourceUri);
    }

    /**
     * The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;File&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ImageTemplateFileCustomizerResponse() {}

    private ImageTemplateFileCustomizerResponse(ImageTemplateFileCustomizerResponse $) {
        this.destination = $.destination;
        this.name = $.name;
        this.sha256Checksum = $.sha256Checksum;
        this.sourceUri = $.sourceUri;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageTemplateFileCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageTemplateFileCustomizerResponse $;

        public Builder() {
            $ = new ImageTemplateFileCustomizerResponse();
        }

        public Builder(ImageTemplateFileCustomizerResponse defaults) {
            $ = new ImageTemplateFileCustomizerResponse(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable String destination) {
            $.destination = destination;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder sha256Checksum(@Nullable String sha256Checksum) {
            $.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder sourceUri(@Nullable String sourceUri) {
            $.sourceUri = sourceUri;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ImageTemplateFileCustomizerResponse build() {
            $.sha256Checksum = Codegen.stringProp("sha256Checksum").arg($.sha256Checksum).def("").getNullable();
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
