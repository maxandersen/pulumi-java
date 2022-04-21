// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketWebsiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketWebsiteArgs Empty = new BucketWebsiteArgs();

    /**
     * Behaves as the bucket&#39;s directory index where
     * missing objects are treated as potential directories.
     * 
     */
    @Import(name="mainPageSuffix")
    private @Nullable Output<String> mainPageSuffix;

    public Optional<Output<String>> mainPageSuffix() {
        return Optional.ofNullable(this.mainPageSuffix);
    }

    /**
     * The custom object to return when a requested
     * resource is not found.
     * 
     */
    @Import(name="notFoundPage")
    private @Nullable Output<String> notFoundPage;

    public Optional<Output<String>> notFoundPage() {
        return Optional.ofNullable(this.notFoundPage);
    }

    private BucketWebsiteArgs() {}

    private BucketWebsiteArgs(BucketWebsiteArgs $) {
        this.mainPageSuffix = $.mainPageSuffix;
        this.notFoundPage = $.notFoundPage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketWebsiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketWebsiteArgs $;

        public Builder() {
            $ = new BucketWebsiteArgs();
        }

        public Builder(BucketWebsiteArgs defaults) {
            $ = new BucketWebsiteArgs(Objects.requireNonNull(defaults));
        }

        public Builder mainPageSuffix(@Nullable Output<String> mainPageSuffix) {
            $.mainPageSuffix = mainPageSuffix;
            return this;
        }

        public Builder mainPageSuffix(String mainPageSuffix) {
            return mainPageSuffix(Output.of(mainPageSuffix));
        }

        public Builder notFoundPage(@Nullable Output<String> notFoundPage) {
            $.notFoundPage = notFoundPage;
            return this;
        }

        public Builder notFoundPage(String notFoundPage) {
            return notFoundPage(Output.of(notFoundPage));
        }

        public BucketWebsiteArgs build() {
            return $;
        }
    }

}
