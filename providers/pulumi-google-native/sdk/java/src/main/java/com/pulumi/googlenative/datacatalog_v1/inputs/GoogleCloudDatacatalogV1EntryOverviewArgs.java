// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Entry overview fields for rich text descriptions of entries.
 * 
 */
public final class GoogleCloudDatacatalogV1EntryOverviewArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1EntryOverviewArgs Empty = new GoogleCloudDatacatalogV1EntryOverviewArgs();

    /**
     * Entry overview with support for rich text. The overview must only contain Unicode characters, and should be formatted using HTML. The maximum length is 10 MiB as this value holds HTML descriptions including encoded images. The maximum length of the text without images is 100 KiB.
     * 
     */
    @Import(name="overview")
    private @Nullable Output<String> overview;

    /**
     * @return Entry overview with support for rich text. The overview must only contain Unicode characters, and should be formatted using HTML. The maximum length is 10 MiB as this value holds HTML descriptions including encoded images. The maximum length of the text without images is 100 KiB.
     * 
     */
    public Optional<Output<String>> overview() {
        return Optional.ofNullable(this.overview);
    }

    private GoogleCloudDatacatalogV1EntryOverviewArgs() {}

    private GoogleCloudDatacatalogV1EntryOverviewArgs(GoogleCloudDatacatalogV1EntryOverviewArgs $) {
        this.overview = $.overview;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1EntryOverviewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1EntryOverviewArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1EntryOverviewArgs();
        }

        public Builder(GoogleCloudDatacatalogV1EntryOverviewArgs defaults) {
            $ = new GoogleCloudDatacatalogV1EntryOverviewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param overview Entry overview with support for rich text. The overview must only contain Unicode characters, and should be formatted using HTML. The maximum length is 10 MiB as this value holds HTML descriptions including encoded images. The maximum length of the text without images is 100 KiB.
         * 
         * @return builder
         * 
         */
        public Builder overview(@Nullable Output<String> overview) {
            $.overview = overview;
            return this;
        }

        /**
         * @param overview Entry overview with support for rich text. The overview must only contain Unicode characters, and should be formatted using HTML. The maximum length is 10 MiB as this value holds HTML descriptions including encoded images. The maximum length of the text without images is 100 KiB.
         * 
         * @return builder
         * 
         */
        public Builder overview(String overview) {
            return overview(Output.of(overview));
        }

        public GoogleCloudDatacatalogV1EntryOverviewArgs build() {
            return $;
        }
    }

}
