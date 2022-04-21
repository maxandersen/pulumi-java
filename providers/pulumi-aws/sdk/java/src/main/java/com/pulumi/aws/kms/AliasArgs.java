// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * The display name of the alias. The name must start with the word &#34;alias&#34; followed by a forward slash (alias/)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates an unique alias beginning with the specified prefix.
     * The name must start with the word &#34;alias&#34; followed by a forward slash (alias/).  Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Identifier for the key for which the alias is for, can be either an ARN or key_id.
     * 
     */
    @Import(name="targetKeyId", required=true)
    private Output<String> targetKeyId;

    public Output<String> targetKeyId() {
        return this.targetKeyId;
    }

    private AliasArgs() {}

    private AliasArgs(AliasArgs $) {
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.targetKeyId = $.targetKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasArgs $;

        public Builder() {
            $ = new AliasArgs();
        }

        public Builder(AliasArgs defaults) {
            $ = new AliasArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder targetKeyId(Output<String> targetKeyId) {
            $.targetKeyId = targetKeyId;
            return this;
        }

        public Builder targetKeyId(String targetKeyId) {
            return targetKeyId(Output.of(targetKeyId));
        }

        public AliasArgs build() {
            $.targetKeyId = Objects.requireNonNull($.targetKeyId, "expected parameter 'targetKeyId' to be non-null");
            return $;
        }
    }

}
