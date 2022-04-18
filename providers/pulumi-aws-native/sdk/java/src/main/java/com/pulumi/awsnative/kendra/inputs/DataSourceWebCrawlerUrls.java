// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerSeedUrlConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerSiteMapsConfiguration;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWebCrawlerUrls extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceWebCrawlerUrls Empty = new DataSourceWebCrawlerUrls();

    @Import(name="seedUrlConfiguration")
      private final @Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration;

    public Optional<DataSourceWebCrawlerSeedUrlConfiguration> seedUrlConfiguration() {
        return this.seedUrlConfiguration == null ? Optional.empty() : Optional.ofNullable(this.seedUrlConfiguration);
    }

    @Import(name="siteMapsConfiguration")
      private final @Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration;

    public Optional<DataSourceWebCrawlerSiteMapsConfiguration> siteMapsConfiguration() {
        return this.siteMapsConfiguration == null ? Optional.empty() : Optional.ofNullable(this.siteMapsConfiguration);
    }

    public DataSourceWebCrawlerUrls(
        @Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration,
        @Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration) {
        this.seedUrlConfiguration = seedUrlConfiguration;
        this.siteMapsConfiguration = siteMapsConfiguration;
    }

    private DataSourceWebCrawlerUrls() {
        this.seedUrlConfiguration = null;
        this.siteMapsConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerUrls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration;
        private @Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerUrls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seedUrlConfiguration = defaults.seedUrlConfiguration;
    	      this.siteMapsConfiguration = defaults.siteMapsConfiguration;
        }

        public Builder seedUrlConfiguration(@Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration) {
            this.seedUrlConfiguration = seedUrlConfiguration;
            return this;
        }
        public Builder siteMapsConfiguration(@Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration) {
            this.siteMapsConfiguration = siteMapsConfiguration;
            return this;
        }        public DataSourceWebCrawlerUrls build() {
            return new DataSourceWebCrawlerUrls(seedUrlConfiguration, siteMapsConfiguration);
        }
    }
}
