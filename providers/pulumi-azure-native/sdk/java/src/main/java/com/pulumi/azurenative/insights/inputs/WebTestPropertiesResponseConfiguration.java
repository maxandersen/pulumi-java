// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An XML configuration specification for a WebTest.
 * 
 */
public final class WebTestPropertiesResponseConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final WebTestPropertiesResponseConfiguration Empty = new WebTestPropertiesResponseConfiguration();

    /**
     * The XML specification of a WebTest to run against an application.
     * 
     */
    @Import(name="webTest")
      private final @Nullable String webTest;

    public Optional<String> webTest() {
        return this.webTest == null ? Optional.empty() : Optional.ofNullable(this.webTest);
    }

    public WebTestPropertiesResponseConfiguration(@Nullable String webTest) {
        this.webTest = webTest;
    }

    private WebTestPropertiesResponseConfiguration() {
        this.webTest = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTestPropertiesResponseConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String webTest;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTestPropertiesResponseConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.webTest = defaults.webTest;
        }

        public Builder webTest(@Nullable String webTest) {
            this.webTest = webTest;
            return this;
        }        public WebTestPropertiesResponseConfiguration build() {
            return new WebTestPropertiesResponseConfiguration(webTest);
        }
    }
}
