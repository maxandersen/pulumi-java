// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of a secret resource.
 * 
 */
public final class SecretResourcePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretResourcePropertiesArgs Empty = new SecretResourcePropertiesArgs();

    /**
     * The type of the content stored in the secret value. The value of this property is opaque to Service Fabric. Once set, the value of this property cannot be changed.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * User readable description of the secret.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Describes the kind of secret.
     * Expected value is &#39;SecretResourceProperties&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    private SecretResourcePropertiesArgs() {}

    private SecretResourcePropertiesArgs(SecretResourcePropertiesArgs $) {
        this.contentType = $.contentType;
        this.description = $.description;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretResourcePropertiesArgs $;

        public Builder() {
            $ = new SecretResourcePropertiesArgs();
        }

        public Builder(SecretResourcePropertiesArgs defaults) {
            $ = new SecretResourcePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public SecretResourcePropertiesArgs build() {
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            return $;
        }
    }

}
