// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class UserHomeDirectoryMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserHomeDirectoryMappingArgs Empty = new UserHomeDirectoryMappingArgs();

    /**
     * Represents an entry and a target.
     * 
     */
    @Import(name="entry", required=true)
    private Output<String> entry;

    public Output<String> entry() {
        return this.entry;
    }

    /**
     * Represents the map target.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    public Output<String> target() {
        return this.target;
    }

    private UserHomeDirectoryMappingArgs() {}

    private UserHomeDirectoryMappingArgs(UserHomeDirectoryMappingArgs $) {
        this.entry = $.entry;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserHomeDirectoryMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserHomeDirectoryMappingArgs $;

        public Builder() {
            $ = new UserHomeDirectoryMappingArgs();
        }

        public Builder(UserHomeDirectoryMappingArgs defaults) {
            $ = new UserHomeDirectoryMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder entry(Output<String> entry) {
            $.entry = entry;
            return this;
        }

        public Builder entry(String entry) {
            return entry(Output.of(entry));
        }

        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public UserHomeDirectoryMappingArgs build() {
            $.entry = Objects.requireNonNull($.entry, "expected parameter 'entry' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
