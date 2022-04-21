// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyGroupState extends com.pulumi.resources.ResourceArgs {

    public static final KeyGroupState Empty = new KeyGroupState();

    /**
     * A comment to describe the key group..
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The identifier for this version of the key group.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * A list of the identifiers of the public keys in the key group.
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<String>> items;

    public Optional<Output<List<String>>> items() {
        return Optional.ofNullable(this.items);
    }

    /**
     * A name to identify the key group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private KeyGroupState() {}

    private KeyGroupState(KeyGroupState $) {
        this.comment = $.comment;
        this.etag = $.etag;
        this.items = $.items;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyGroupState $;

        public Builder() {
            $ = new KeyGroupState();
        }

        public Builder(KeyGroupState defaults) {
            $ = new KeyGroupState(Objects.requireNonNull(defaults));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder items(@Nullable Output<List<String>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<String> items) {
            return items(Output.of(items));
        }

        public Builder items(String... items) {
            return items(List.of(items));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public KeyGroupState build() {
            return $;
        }
    }

}
