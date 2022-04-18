// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Actions on Google action to open a given url.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse();

    /**
     * URL
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    /**
     * Optional. Specifies the type of viewer that is used when opening the URL. Defaults to opening via web browser.
     * 
     */
    @Import(name="urlTypeHint", required=true)
      private final String urlTypeHint;

    public String urlTypeHint() {
        return this.urlTypeHint;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse(
        String url,
        String urlTypeHint) {
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.urlTypeHint = Objects.requireNonNull(urlTypeHint, "expected parameter 'urlTypeHint' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse() {
        this.url = null;
        this.urlTypeHint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String url;
        private String urlTypeHint;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
    	      this.urlTypeHint = defaults.urlTypeHint;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder urlTypeHint(String urlTypeHint) {
            this.urlTypeHint = Objects.requireNonNull(urlTypeHint);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse(url, urlTypeHint);
        }
    }
}
