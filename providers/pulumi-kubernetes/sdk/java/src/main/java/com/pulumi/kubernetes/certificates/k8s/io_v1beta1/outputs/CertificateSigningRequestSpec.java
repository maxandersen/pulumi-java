// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateSigningRequestSpec {
    /**
     * Extra information about the requesting user. See user.Info interface for details.
     * 
     */
    private final @Nullable Map<String,List<String>> extra;
    /**
     * Group information about the requesting user. See user.Info interface for details.
     * 
     */
    private final @Nullable List<String> groups;
    /**
     * Base64-encoded PKCS#10 CSR data
     * 
     */
    private final String request;
    /**
     * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
     *  1. If it&#39;s a kubelet client certificate, it is assigned
     *     &#34;kubernetes.io/kube-apiserver-client-kubelet&#34;.
     *  2. If it&#39;s a kubelet serving certificate, it is assigned
     *     &#34;kubernetes.io/kubelet-serving&#34;.
     *  3. Otherwise, it is assigned &#34;kubernetes.io/legacy-unknown&#34;.
     *     Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
     * 
     */
    private final @Nullable String signerName;
    /**
     * UID information about the requesting user. See user.Info interface for details.
     * 
     */
    private final @Nullable String uid;
    /**
     * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * 
     */
    private final @Nullable List<String> usages;
    /**
     * Information about the requesting user. See user.Info interface for details.
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private CertificateSigningRequestSpec(
        @CustomType.Parameter("extra") @Nullable Map<String,List<String>> extra,
        @CustomType.Parameter("groups") @Nullable List<String> groups,
        @CustomType.Parameter("request") String request,
        @CustomType.Parameter("signerName") @Nullable String signerName,
        @CustomType.Parameter("uid") @Nullable String uid,
        @CustomType.Parameter("usages") @Nullable List<String> usages,
        @CustomType.Parameter("username") @Nullable String username) {
        this.extra = extra;
        this.groups = groups;
        this.request = request;
        this.signerName = signerName;
        this.uid = uid;
        this.usages = usages;
        this.username = username;
    }

    /**
     * Extra information about the requesting user. See user.Info interface for details.
     * 
    */
    public Map<String,List<String>> extra() {
        return this.extra == null ? Map.of() : this.extra;
    }
    /**
     * Group information about the requesting user. See user.Info interface for details.
     * 
    */
    public List<String> groups() {
        return this.groups == null ? List.of() : this.groups;
    }
    /**
     * Base64-encoded PKCS#10 CSR data
     * 
    */
    public String request() {
        return this.request;
    }
    /**
     * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
     *  1. If it&#39;s a kubelet client certificate, it is assigned
     *     &#34;kubernetes.io/kube-apiserver-client-kubelet&#34;.
     *  2. If it&#39;s a kubelet serving certificate, it is assigned
     *     &#34;kubernetes.io/kubelet-serving&#34;.
     *  3. Otherwise, it is assigned &#34;kubernetes.io/legacy-unknown&#34;.
     *     Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
     * 
    */
    public Optional<String> signerName() {
        return Optional.ofNullable(this.signerName);
    }
    /**
     * UID information about the requesting user. See user.Info interface for details.
     * 
    */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * 
    */
    public List<String> usages() {
        return this.usages == null ? List.of() : this.usages;
    }
    /**
     * Information about the requesting user. See user.Info interface for details.
     * 
    */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,List<String>> extra;
        private @Nullable List<String> groups;
        private String request;
        private @Nullable String signerName;
        private @Nullable String uid;
        private @Nullable List<String> usages;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extra = defaults.extra;
    	      this.groups = defaults.groups;
    	      this.request = defaults.request;
    	      this.signerName = defaults.signerName;
    	      this.uid = defaults.uid;
    	      this.usages = defaults.usages;
    	      this.username = defaults.username;
        }

        public Builder extra(@Nullable Map<String,List<String>> extra) {
            this.extra = extra;
            return this;
        }
        public Builder groups(@Nullable List<String> groups) {
            this.groups = groups;
            return this;
        }
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }
        public Builder request(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }
        public Builder signerName(@Nullable String signerName) {
            this.signerName = signerName;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        public Builder usages(@Nullable List<String> usages) {
            this.usages = usages;
            return this;
        }
        public Builder usages(String... usages) {
            return usages(List.of(usages));
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public CertificateSigningRequestSpec build() {
            return new CertificateSigningRequestSpec(extra, groups, request, signerName, uid, usages, username);
        }
    }
}
