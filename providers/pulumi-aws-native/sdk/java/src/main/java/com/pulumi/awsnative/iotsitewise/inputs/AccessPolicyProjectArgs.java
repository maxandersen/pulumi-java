// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A project resource.
 * 
 */
public final class AccessPolicyProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyProjectArgs Empty = new AccessPolicyProjectArgs();

    /**
     * The ID of the project.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private AccessPolicyProjectArgs() {}

    private AccessPolicyProjectArgs(AccessPolicyProjectArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyProjectArgs $;

        public Builder() {
            $ = new AccessPolicyProjectArgs();
        }

        public Builder(AccessPolicyProjectArgs defaults) {
            $ = new AccessPolicyProjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public AccessPolicyProjectArgs build() {
            return $;
        }
    }

}
