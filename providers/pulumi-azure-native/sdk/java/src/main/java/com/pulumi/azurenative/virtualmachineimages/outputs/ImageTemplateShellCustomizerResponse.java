// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageTemplateShellCustomizerResponse {
    /**
     * Array of shell commands to execute
     * 
     */
    private final @Nullable List<String> inline;
    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    private final @Nullable String name;
    /**
     * URI of the shell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    private final @Nullable String scriptUri;
    /**
     * SHA256 checksum of the shell script provided in the scriptUri field
     * 
     */
    private final @Nullable String sha256Checksum;
    /**
     * The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;Shell&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ImageTemplateShellCustomizerResponse(
        @CustomType.Parameter("inline") @Nullable List<String> inline,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("scriptUri") @Nullable String scriptUri,
        @CustomType.Parameter("sha256Checksum") @Nullable String sha256Checksum,
        @CustomType.Parameter("type") String type) {
        this.inline = inline;
        this.name = name;
        this.scriptUri = scriptUri;
        this.sha256Checksum = sha256Checksum;
        this.type = type;
    }

    /**
     * Array of shell commands to execute
     * 
    */
    public List<String> inline() {
        return this.inline == null ? List.of() : this.inline;
    }
    /**
     * Friendly Name to provide context on what this customization step does
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * URI of the shell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
     * 
    */
    public Optional<String> scriptUri() {
        return Optional.ofNullable(this.scriptUri);
    }
    /**
     * SHA256 checksum of the shell script provided in the scriptUri field
     * 
    */
    public Optional<String> sha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }
    /**
     * The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;Shell&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateShellCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> inline;
        private @Nullable String name;
        private @Nullable String scriptUri;
        private @Nullable String sha256Checksum;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateShellCustomizerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inline = defaults.inline;
    	      this.name = defaults.name;
    	      this.scriptUri = defaults.scriptUri;
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.type = defaults.type;
        }

        public Builder inline(@Nullable List<String> inline) {
            this.inline = inline;
            return this;
        }
        public Builder inline(String... inline) {
            return inline(List.of(inline));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder scriptUri(@Nullable String scriptUri) {
            this.scriptUri = scriptUri;
            return this;
        }
        public Builder sha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ImageTemplateShellCustomizerResponse build() {
            return new ImageTemplateShellCustomizerResponse(inline, name, scriptUri, sha256Checksum, type);
        }
    }
}
