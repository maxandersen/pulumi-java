// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EntityTypeTag extends com.pulumi.resources.InvokeArgs {

    public static final EntityTypeTag Empty = new EntityTypeTag();

    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private EntityTypeTag() {}

    private EntityTypeTag(EntityTypeTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntityTypeTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntityTypeTag $;

        public Builder() {
            $ = new EntityTypeTag();
        }

        public Builder(EntityTypeTag defaults) {
            $ = new EntityTypeTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public EntityTypeTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
