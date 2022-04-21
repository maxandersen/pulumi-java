// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.dynamodb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableProjectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalTableProjectionArgs Empty = new GlobalTableProjectionArgs();

    @Import(name="nonKeyAttributes")
    private @Nullable Output<List<String>> nonKeyAttributes;

    public Optional<Output<List<String>>> nonKeyAttributes() {
        return Optional.ofNullable(this.nonKeyAttributes);
    }

    @Import(name="projectionType")
    private @Nullable Output<String> projectionType;

    public Optional<Output<String>> projectionType() {
        return Optional.ofNullable(this.projectionType);
    }

    private GlobalTableProjectionArgs() {}

    private GlobalTableProjectionArgs(GlobalTableProjectionArgs $) {
        this.nonKeyAttributes = $.nonKeyAttributes;
        this.projectionType = $.projectionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalTableProjectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalTableProjectionArgs $;

        public Builder() {
            $ = new GlobalTableProjectionArgs();
        }

        public Builder(GlobalTableProjectionArgs defaults) {
            $ = new GlobalTableProjectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder nonKeyAttributes(@Nullable Output<List<String>> nonKeyAttributes) {
            $.nonKeyAttributes = nonKeyAttributes;
            return this;
        }

        public Builder nonKeyAttributes(List<String> nonKeyAttributes) {
            return nonKeyAttributes(Output.of(nonKeyAttributes));
        }

        public Builder nonKeyAttributes(String... nonKeyAttributes) {
            return nonKeyAttributes(List.of(nonKeyAttributes));
        }

        public Builder projectionType(@Nullable Output<String> projectionType) {
            $.projectionType = projectionType;
            return this;
        }

        public Builder projectionType(String projectionType) {
            return projectionType(Output.of(projectionType));
        }

        public GlobalTableProjectionArgs build() {
            return $;
        }
    }

}
