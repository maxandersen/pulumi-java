// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.domainregistration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TldLegalAgreementResponse {
    /**
     * @return Unique identifier for the agreement.
     * 
     */
    private final String agreementKey;
    /**
     * @return Agreement details.
     * 
     */
    private final String content;
    /**
     * @return Agreement title.
     * 
     */
    private final String title;
    /**
     * @return URL where a copy of the agreement details is hosted.
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private TldLegalAgreementResponse(
        @CustomType.Parameter("agreementKey") String agreementKey,
        @CustomType.Parameter("content") String content,
        @CustomType.Parameter("title") String title,
        @CustomType.Parameter("url") @Nullable String url) {
        this.agreementKey = agreementKey;
        this.content = content;
        this.title = title;
        this.url = url;
    }

    /**
     * @return Unique identifier for the agreement.
     * 
     */
    public String agreementKey() {
        return this.agreementKey;
    }
    /**
     * @return Agreement details.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return Agreement title.
     * 
     */
    public String title() {
        return this.title;
    }
    /**
     * @return URL where a copy of the agreement details is hosted.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TldLegalAgreementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agreementKey;
        private String content;
        private String title;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(TldLegalAgreementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreementKey = defaults.agreementKey;
    	      this.content = defaults.content;
    	      this.title = defaults.title;
    	      this.url = defaults.url;
        }

        public Builder agreementKey(String agreementKey) {
            this.agreementKey = Objects.requireNonNull(agreementKey);
            return this;
        }
        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public TldLegalAgreementResponse build() {
            return new TldLegalAgreementResponse(agreementKey, content, title, url);
        }
    }
}
