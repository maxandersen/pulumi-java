// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureEntityOverride extends com.pulumi.resources.InvokeArgs {

    public static final FeatureEntityOverride Empty = new FeatureEntityOverride();

    @Import(name="entityId")
    private @Nullable String entityId;

    public Optional<String> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    @Import(name="variation")
    private @Nullable String variation;

    public Optional<String> variation() {
        return Optional.ofNullable(this.variation);
    }

    private FeatureEntityOverride() {}

    private FeatureEntityOverride(FeatureEntityOverride $) {
        this.entityId = $.entityId;
        this.variation = $.variation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureEntityOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureEntityOverride $;

        public Builder() {
            $ = new FeatureEntityOverride();
        }

        public Builder(FeatureEntityOverride defaults) {
            $ = new FeatureEntityOverride(Objects.requireNonNull(defaults));
        }

        public Builder entityId(@Nullable String entityId) {
            $.entityId = entityId;
            return this;
        }

        public Builder variation(@Nullable String variation) {
            $.variation = variation;
            return this;
        }

        public FeatureEntityOverride build() {
            return $;
        }
    }

}
