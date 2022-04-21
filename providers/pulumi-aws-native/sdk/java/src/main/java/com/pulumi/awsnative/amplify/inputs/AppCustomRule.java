// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplify.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppCustomRule extends com.pulumi.resources.InvokeArgs {

    public static final AppCustomRule Empty = new AppCustomRule();

    @Import(name="condition")
    private @Nullable String condition;

    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="source", required=true)
    private String source;

    public String source() {
        return this.source;
    }

    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="target", required=true)
    private String target;

    public String target() {
        return this.target;
    }

    private AppCustomRule() {}

    private AppCustomRule(AppCustomRule $) {
        this.condition = $.condition;
        this.source = $.source;
        this.status = $.status;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppCustomRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppCustomRule $;

        public Builder() {
            $ = new AppCustomRule();
        }

        public Builder(AppCustomRule defaults) {
            $ = new AppCustomRule(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable String condition) {
            $.condition = condition;
            return this;
        }

        public Builder source(String source) {
            $.source = source;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public Builder target(String target) {
            $.target = target;
            return this;
        }

        public AppCustomRule build() {
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
