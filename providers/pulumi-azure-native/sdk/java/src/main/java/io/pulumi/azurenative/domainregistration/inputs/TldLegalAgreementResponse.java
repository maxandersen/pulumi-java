// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Legal agreement for a top level domain.
 * 
 */
public final class TldLegalAgreementResponse extends io.pulumi.resources.InvokeArgs {

    public static final TldLegalAgreementResponse Empty = new TldLegalAgreementResponse();

    /**
     * Unique identifier for the agreement.
     * 
     */
    @Import(name="agreementKey", required=true)
      private final String agreementKey;

    public String agreementKey() {
        return this.agreementKey;
    }

    /**
     * Agreement details.
     * 
     */
    @Import(name="content", required=true)
      private final String content;

    public String content() {
        return this.content;
    }

    /**
     * Agreement title.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String title() {
        return this.title;
    }

    /**
     * URL where a copy of the agreement details is hosted.
     * 
     */
    @Import(name="url")
      private final @Nullable String url;

    public Optional<String> url() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public TldLegalAgreementResponse(
        String agreementKey,
        String content,
        String title,
        @Nullable String url) {
        this.agreementKey = Objects.requireNonNull(agreementKey, "expected parameter 'agreementKey' to be non-null");
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
        this.url = url;
    }

    private TldLegalAgreementResponse() {
        this.agreementKey = null;
        this.content = null;
        this.title = null;
        this.url = null;
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
