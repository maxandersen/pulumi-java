// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSourceResult {
    /**
     * The canonical name of the finding. It&#39;s either &#34;organizations/{organization_id}/sources/{source_id}&#34;, &#34;folders/{folder_id}/sources/{source_id}&#34; or &#34;projects/{project_number}/sources/{source_id}&#34;, depending on the closest CRM ancestor of the resource associated with the finding.
     * 
     */
    private final String canonicalName;
    /**
     * The description of the source (max of 1024 characters). Example: &#34;Web Security Scanner is a web security scanner for common vulnerabilities in App Engine applications. It can automatically scan and detect four common vulnerabilities, including cross-site-scripting (XSS), Flash injection, mixed content (HTTP in HTTPS), and outdated or insecure libraries.&#34;
     * 
     */
    private final String description;
    /**
     * The source&#39;s display name. A source&#39;s display name must be unique amongst its siblings, for example, two sources with the same parent can&#39;t share the same display name. The display name must have a length between 1 and 64 characters (inclusive).
     * 
     */
    private final String displayName;
    /**
     * The relative resource name of this source. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: &#34;organizations/{organization_id}/sources/{source_id}&#34;
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetSourceResult(
        @CustomType.Parameter("canonicalName") String canonicalName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name) {
        this.canonicalName = canonicalName;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
    }

    /**
     * The canonical name of the finding. It&#39;s either &#34;organizations/{organization_id}/sources/{source_id}&#34;, &#34;folders/{folder_id}/sources/{source_id}&#34; or &#34;projects/{project_number}/sources/{source_id}&#34;, depending on the closest CRM ancestor of the resource associated with the finding.
     * 
    */
    public String canonicalName() {
        return this.canonicalName;
    }
    /**
     * The description of the source (max of 1024 characters). Example: &#34;Web Security Scanner is a web security scanner for common vulnerabilities in App Engine applications. It can automatically scan and detect four common vulnerabilities, including cross-site-scripting (XSS), Flash injection, mixed content (HTTP in HTTPS), and outdated or insecure libraries.&#34;
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The source&#39;s display name. A source&#39;s display name must be unique amongst its siblings, for example, two sources with the same parent can&#39;t share the same display name. The display name must have a length between 1 and 64 characters (inclusive).
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * The relative resource name of this source. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: &#34;organizations/{organization_id}/sources/{source_id}&#34;
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalName;
        private String description;
        private String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalName = defaults.canonicalName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder canonicalName(String canonicalName) {
            this.canonicalName = Objects.requireNonNull(canonicalName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetSourceResult build() {
            return new GetSourceResult(canonicalName, description, displayName, name);
        }
    }
}
