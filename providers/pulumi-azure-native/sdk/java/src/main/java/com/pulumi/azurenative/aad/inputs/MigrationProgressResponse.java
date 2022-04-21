// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aad.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Migration Progress
 * 
 */
public final class MigrationProgressResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrationProgressResponse Empty = new MigrationProgressResponse();

    /**
     * Completion Percentage
     * 
     */
    @Import(name="completionPercentage")
    private @Nullable Double completionPercentage;

    public Optional<Double> completionPercentage() {
        return Optional.ofNullable(this.completionPercentage);
    }

    /**
     * Progress Message
     * 
     */
    @Import(name="progressMessage")
    private @Nullable String progressMessage;

    public Optional<String> progressMessage() {
        return Optional.ofNullable(this.progressMessage);
    }

    private MigrationProgressResponse() {}

    private MigrationProgressResponse(MigrationProgressResponse $) {
        this.completionPercentage = $.completionPercentage;
        this.progressMessage = $.progressMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrationProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationProgressResponse $;

        public Builder() {
            $ = new MigrationProgressResponse();
        }

        public Builder(MigrationProgressResponse defaults) {
            $ = new MigrationProgressResponse(Objects.requireNonNull(defaults));
        }

        public Builder completionPercentage(@Nullable Double completionPercentage) {
            $.completionPercentage = completionPercentage;
            return this;
        }

        public Builder progressMessage(@Nullable String progressMessage) {
            $.progressMessage = progressMessage;
            return this;
        }

        public MigrationProgressResponse build() {
            return $;
        }
    }

}
